package jmu.hw.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import jmu.hw.po.Borrow;
import jmu.hw.po.BorrowExample;
import jmu.hw.po.Reader;
import jmu.hw.service.BookDescService;
import jmu.hw.service.BookService;
import jmu.hw.service.BorrowService;
import jmu.hw.util.ResponseMessage;

@Controller
public class BorrowController {

	@Autowired
	private BorrowService borrowService;
	@Autowired
	private BookDescService bookDescService;
	@Autowired
	private BookService bookService;
	
	@ResponseBody
	@RequestMapping(value="/getBorrowList")
    public ResponseMessage GetList(@RequestParam(value="pn",defaultValue="1" )Integer pn,
			               @RequestParam(value="searchContent")String searchContent,
			               @RequestParam(value="radioValue")String radioValue){
		
		PageHelper.startPage(pn,15);
		List<Borrow> borrow  = new ArrayList<Borrow>();
		
		if("readerId".equals(radioValue)){
			//按读者ID查找
			borrow = borrowService.selectByExampleBorrowWithReaderId(searchContent);
		}else if("bookName".equals(radioValue)){
			//按书名模糊查询
			borrow = borrowService.selectByExampleBorrowWithBookName("%"+searchContent+"%");
		}else if("bookId".equals(radioValue)){
			//按图书ID查询
			borrow = borrowService.selectByExampleBorrowWithBookId(searchContent);
		}else{
			//查找全部
			borrow = borrowService.selectByExampleWithBook(null);
			System.out.println("查找全部");
			
		}

		PageInfo page = new PageInfo(borrow,5);
		return ResponseMessage.success().addObject("mylist", page);
		
	}
	
	
	@ResponseBody
	@RequestMapping(value="/readerBorrowDetails")
    public ResponseMessage readerBorrowDetails(@RequestParam(value="pn",defaultValue="1" )Integer pn,HttpSession session){
		PageHelper.startPage(pn,15);
		Reader reader = (Reader)session.getAttribute("loginReader");
	//	be.createCriteria().andReade;
		List<Borrow> borrow = borrowService.selectByExampleWithReaderDetail(reader.getReaderId());
		PageInfo page = new PageInfo(borrow,5);
		return ResponseMessage.success().addObject("mylist", page);
		
	}
	@ResponseBody
	@RequestMapping(value="/getPrintList")
    public ResponseMessage getReporList(@RequestParam(value="pn",defaultValue="1" )Integer pn, @RequestParam(value="searchContent")String readerId,
    		                            @RequestParam(value="unitId")String unitId,@RequestParam(value="startDate")String startDate,
    		                            @RequestParam(value="endDate")String endDate){
		PageHelper.startPage(pn,15);
		SimpleDateFormat myFormatter = new SimpleDateFormat("yyyy-MM-dd");  
		Date date =new Date();  
		String nowDate = myFormatter.format(date); 
		List<Borrow> borrow = new ArrayList<Borrow>();
		if(endDate==""||endDate==null)
			endDate = nowDate;
		if(startDate== null ||startDate=="")
		{
			if(unitId!=""&&unitId!=null)
					borrow = borrowService.selectByExampleWithUnitPart(unitId);
			else
					borrow = borrowService.selectByExampleWithIdPart("%"+readerId+"%");
			
		}else{
			if(unitId!=""&&unitId!=null)
				borrow = borrowService.selectByExampleWithUnitPartDate(unitId,startDate,endDate);
		    else
				borrow = borrowService.selectByExampleWithIdPartDate("%"+readerId+"%",startDate,endDate);
		}
		PageInfo page = new PageInfo(borrow,5);
		return ResponseMessage.success().addObject("mylist", page);
		
	}
	
}
