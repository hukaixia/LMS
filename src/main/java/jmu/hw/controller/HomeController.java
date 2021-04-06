package jmu.hw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class HomeController {
	
	//图书检索
	@RequestMapping(value="/bookCallno")
	public String BookCallno(){
		return "ReaderBookCallno";
	}
	
	//借阅指南
	@RequestMapping(value="/borrowGuidence")
	public String BookGuidence(){
		return "BorrowGuidance";
	}
	
	//进入个人中心
	@RequestMapping(value="/personalCenter")
	public String PersonalCenter(){
		return "PersonalCenter";
	}
	//借阅详情
	@RequestMapping(value="/borrowDetails")
		public String BorrowDetails(){
			return "BorrowDetails";
	}
	
	//借阅详情
		@RequestMapping(value="/fineDetails")
			public String FineDetail(){
				return "FineDetail";
		}
	
	//进入我的图书馆界面
	@RequestMapping(value="/myLibrary")
	public String MyLibrary(){
		return "MyLibrary";
	}
	//首页
	@RequestMapping(value="/homePage")
	public String HomePage(){
		return "HomePage";
	}
	
	//新书推荐
	@RequestMapping(value="/newBookIntro")
	public String NewBookIntro(){
		return "NewBookIntro";
	}
	
	//借阅须知
	@RequestMapping(value="/borrowIntro")
	public String BorrowIntro(){
		return "BorrowInstrution";
	}
	//中图分类
	@RequestMapping(value="/clcCallno")
	public String ClcCallno(){
		return "ClcCallno";
	}	
	
	//图书检索
	@RequestMapping(value="/readerBookCallno")
	public String ReaderBookCallno(){
		return "ReaderBookCallno";
	}

	   
	@RequestMapping(value="/login")
	public String Login(){
		return "LoginPage";
	}	
}
