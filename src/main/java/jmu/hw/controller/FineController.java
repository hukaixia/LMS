package jmu.hw.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import jmu.hw.po.BookDesc;
import jmu.hw.po.BookDescExample;
import jmu.hw.po.Fine;
import jmu.hw.po.FineDetail;
import jmu.hw.po.FineDetailKey;
import jmu.hw.service.AdminService;
import jmu.hw.service.FineService;
import jmu.hw.util.ResponseMessage;

@Controller
public class FineController {
	@Autowired
	private FineService fineService;
	@Autowired
	private AdminService adminService;
	
	@ResponseBody
	@RequestMapping("/getFineList")
	public ResponseMessage GetMNewBook(@RequestParam(value="pn",defaultValue="1" )Integer pn,@RequestParam
	(value="radioValue")String radioValue,@RequestParam(value="searchContent")String searchContent){
		PageHelper.startPage(pn,15);
		System.out.println(radioValue+"  "+searchContent);
        List<Fine> fine = new ArrayList<Fine>();
        if("bookName".equals(radioValue))
        	fine = fineService.selectByExampleByBookNamePart("%"+searchContent+"%");
        else if("readerId".equals(radioValue))
        	fine = fineService.selectByExampleByReaderIdPart("%"+searchContent+"%");
        else if("userName".equals(radioValue))
        	fine = fineService.selectByExampleByUserNamePart("%"+searchContent+"%");
        else 
        	fine = fineService.selectByExampleWithAll(null);
		PageInfo page = new PageInfo(fine,5);
		return ResponseMessage.success().addObject("mylist", page);
	}
	
	@RequestMapping("/addFineDetail")
	public String addFineDetail(@RequestParam(value="fineId")Integer fineId,@RequestParam(value="fineDamage")BigDecimal fineDamage,
			@RequestParam(value="fineMissed")BigDecimal fineMissed){
		System.out.println(fineId);
		Fine fine = fineService.selectByPrimaryKey(fineId);
		System.out.println(fine.getFineTotal());
		FineDetail fineDetail = new FineDetail();
		fineDetail.setFineId(fineId);
		fineDetail.setFineDetailId(1);
		fineDetail.setFineReason("破损");
		fineDetail.setFineUnivalence(fineDamage);
	    if(fineDamage!=null){
	    	BigDecimal bg = fine.getFineTotal().add(fineDamage);
	    	fine.setFineTotal(bg);
	        adminService.adminHandelFine(fine, fineDetail);
	    }
		
		return "HandleFine";
	}
	@RequestMapping("/addFine")
	public String AddFine(@RequestParam(value="readerId")String readerId,@RequestParam(value="bookId")Integer bookId,@RequestParam(value="fineDamage")BigDecimal fineDamage,
			@RequestParam(value="fineMissed")BigDecimal fineMissed){
		Fine fine = new Fine();
		
		//获取当前时间
		SimpleDateFormat  sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		String fineTime = sdf.format(date);
		fine.setReaderId(readerId);
		fine.setBookId(bookId);
		fine.setFineTime(fineTime);
		FineDetail fd = new FineDetail();
		if(fineDamage!=null){
			fine.setFineTotal(fineDamage);
			
			fd.setFineDetailId(1);
			fd.setFineReason("破损");
			fd.setFineUnivalence(fineDamage);			
		}else if(fineMissed!=null){
			fine.setFineTotal(fineMissed);
			fd.setFineDetailId(2);
			fd.setFineReason("丢失");
			fd.setFineUnivalence(fineMissed);
		}
		
		adminService.adminAddFine(fine, fd);
		return "HandleFine";
	}
	@ResponseBody
	@RequestMapping("/deleteFine")
	public ResponseMessage deleteFine(@RequestParam(value="fineId")Integer fineId){

		int count =fineService.deleteByPrimaryKey(fineId);
		if(count>0)
		    return ResponseMessage.success();
		else
			return ResponseMessage.error();
	}
}
