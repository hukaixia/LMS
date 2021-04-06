package jmu.hw.controller;

import java.util.ArrayList;
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
import jmu.hw.service.BookDescService;
import jmu.hw.util.ResponseMessage;

@Controller
public class BookDescController {

	@Autowired
	private BookDescService bookDescService;

	@ResponseBody
	@RequestMapping("/getNewBooks")
	public ResponseMessage GetMNewBook(@RequestParam(value="pn",defaultValue="1" )Integer pn){
		PageHelper.startPage(pn,8);
      
        BookDescExample bde = new BookDescExample();
        bde.createCriteria().andBorrowTypeIdEqualTo("B3");
        List<BookDesc> book =bookDescService.selectByExample(bde);
       //使用pageinfo包装,封装了详细的信息,传入连续显示的页数
		PageInfo page = new PageInfo(book,5);
		return ResponseMessage.success().addObject("bookList", page);
	}
	
	@ResponseBody
	@RequestMapping("/bookList")
	public ResponseMessage BookList(@RequestParam(value="pn",defaultValue="1" )Integer pn){
		PageHelper.startPage(pn,15);
        List<BookDesc> book =bookDescService.selectByExampleWithPress(null);
       //使用pageinfo包装,封装了详细的信息,传入连续显示的页数
		PageInfo page = new PageInfo(book,5);
		return ResponseMessage.success().addObject("mylist", page);
	}
	
	@ResponseBody
	@RequestMapping("/bookLists")
	public ResponseMessage BookLists(@RequestParam(value="pn",defaultValue="1" )Integer pn,
			               @RequestParam(value="searchContent")String searchContent,@RequestParam(value="radioValue")String radioValue){
		PageHelper.startPage(pn,15);
		List<BookDesc> book = new ArrayList<BookDesc>();
		if("bookCallno".equals(radioValue)){
			book =bookDescService.selectByCallnoPart("%"+searchContent+"%");
		}
		else if("bookISBN".equals(radioValue)){
			book =bookDescService.selectByISBNPart("%"+searchContent+"%");
		}else if("themeWord".equals(radioValue)){
			book =bookDescService.selectByContentPart("%"+searchContent+"%");
		}
		else if("bookName".equals(radioValue)){
			book =bookDescService.selectByNamePart("%"+searchContent+"%");
		}else
            book =bookDescService.selectByExampleWithPress(null);
       //使用pageinfo包装,封装了详细的信息,传入连续显示的页数
		PageInfo page = new PageInfo(book,5);
		return ResponseMessage.success().addObject("mylist", page);
	}
	
	//校验索书号是否唯一
	@ResponseBody
	@RequestMapping("/bookCallnoCheck")
	public ResponseMessage BookCallnoCheck(@RequestParam(value="bookCallno" )String bookCallno){
		BookDesc bookDesc = bookDescService.selectByPrimaryKey(bookCallno);
		if(bookDesc==null)
		   return ResponseMessage.success();
		else
			return ResponseMessage.error();
	}
	
	//中图分类获取图书信息
	@ResponseBody
	@RequestMapping("/clcBookLists")
	public ResponseMessage clcBookList(@RequestParam(value="pn",defaultValue="1" )Integer pn,
			                           @RequestParam(value="clcId")String clcId){
		
		PageHelper.startPage(pn,15);
		if(clcId==null)
			clcId="";
		BookDescExample bde  = new BookDescExample();
		bde.createCriteria().andClcIdLike(clcId+"%");
        List<BookDesc> book =bookDescService.selectByExampleWithPress(bde);
       //使用pageinfo包装,封装了详细的信息,传入连续显示的页数
		PageInfo page = new PageInfo(book,5);
		return ResponseMessage.success().addObject("mylist", page);
	}
}
