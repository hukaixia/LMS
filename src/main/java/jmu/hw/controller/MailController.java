package jmu.hw.controller;

import org.omg.PortableServer.RequestProcessingPolicyOperations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import jmu.hw.po.Reader;
import jmu.hw.service.ReaderService;
import jmu.hw.util.CalculatorUtil;
import jmu.hw.util.ResponseMessage;
import jmu.hw.util.SendMail;
import jmu.hw.util.VerifyCodeUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileInputStream;
import java.util.*;

@Controller
public class MailController {
	/**
	 *     * 发送自由编辑的邮件     *     * @param toEmailAddress 收件人邮箱     * @param
	 * emailTitle 邮件主题     * @param emailContent 邮件内容     * @return    
	 */
	
	 @Autowired
	 private ReaderService readerService;
	@RequestMapping(value = { "/sendEmailForPswd" }, method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public ResponseMessage sendEmailOwn(@RequestParam("readerId") String readerId,
			@RequestParam("readerEmail") String readerEmail) {
		   Reader reader = readerService.selectByPrimaryKey(readerId);
		   System.out.println(reader.getReaderEmail()+reader.getUserName());
		   if(reader==null ||!readerEmail.equals(reader.getReaderEmail()))
			   return ResponseMessage.error();
		   String emailTitle = "LMS 密码找回！";
		   String emailContent = "亲爱的用户" +reader.getUserName()+"您好，"+"您在LMS图书馆管理系统登录的密码为："+reader.getUserPswd();
		 try {
			// 发送邮件
			SendMail.sendEmail(reader.getReaderEmail(),emailTitle ,emailContent );
			return ResponseMessage.success();
		 } catch (Exception e) {
			return ResponseMessage.error();
		}
	}

	/**
	 *     * 发送系统验证     *     * @param toEmailAddress 收件人邮箱     * @return    
	 */
	@RequestMapping(value = { "/sendEmailSystem/" }, method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public String sendEmailSystem(@RequestParam("toEmailAddress") String toEmailAddress) {
		try {
			// 生成验证码
			String verifyCode = VerifyCodeUtil.generateVerifyCode(6);

			// 邮件主题
			String emailTitle = "【好学堂】邮箱验证";

			// 邮件内容
			String emailContent = "您正在【好学堂】进行邮箱验证，您的验证码为：" + verifyCode + "，请于10分钟内完成验证！";

			// 发送邮件
			SendMail.sendEmail(toEmailAddress, emailTitle, emailContent);
			return CalculatorUtil.getJSONString(0, verifyCode);
		} catch (Exception e) {
			return CalculatorUtil.getJSONString(1, "邮件发送失败！");
		}
	}
}