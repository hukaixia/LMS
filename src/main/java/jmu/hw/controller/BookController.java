package jmu.hw.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import jmu.hw.po.Book;
import jmu.hw.po.BookDesc;
import jmu.hw.po.BookDescExample;
import jmu.hw.po.BookExample;
import jmu.hw.po.Editor;
import jmu.hw.po.EditorExample;
import jmu.hw.po.Press;
import jmu.hw.service.BookDescService;
import jmu.hw.service.BookService;
import jmu.hw.service.EditorService;
import jmu.hw.service.PressService;
import jmu.hw.util.ResponseMessage;

@Controller
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@Autowired
	private BookDescService bookDescService;
	@Autowired
	private EditorService editorService;
	@Autowired
	private PressService pressService;

	@RequestMapping(value="/bookDetail")
	public String GetBookDetail(HttpServletRequest request,Model model){
		String bookCallno = request.getParameter("bookCallno");
		BookDescExample bde = new BookDescExample();
		bde.createCriteria().andBookCallnoEqualTo(bookCallno);
		BookDesc bookDesc =  bookDescService.selectByExampleWithPress(bde).get(0);
		
		BookDesc bookBranch = bookDescService.selectByPrimaryKeyBranch(bookCallno);
		BookExample be = new BookExample();
		be.createCriteria().andBookCallnoEqualTo(bookCallno);
		List<Book> books = bookService.selectByExample(be);
		EditorExample ee = new EditorExample();
		ee.createCriteria().andBookCallnoEqualTo(bookDesc.getBookCallno());
		List<Editor> editors = editorService.selectByExampleWithWriter(ee);
		Press press = pressService.selectByPressId(bookDesc.getPressId());
		String adress = "("+press.getRegion().getCity().getProvince().getProvinceName()+" "+
		                press.getRegion().getCity().getCityName()+" "+press.getRegion().getRegionName()+")";
		model.addAttribute("books",books);
		model.addAttribute("bookDesc",bookDesc);
		model.addAttribute("bookBranch",bookBranch);
		model.addAttribute("editors",editors);
		model.addAttribute("pressAdress", adress);
		return "BookDetails";
	}
	
	@RequestMapping(value="/readerBookDetail")
	public String ReaderBookDetail(HttpServletRequest request,Model model){
		String bookCallno = request.getParameter("bookCallno");
		BookDescExample bde = new BookDescExample();
		bde.createCriteria().andBookCallnoEqualTo(bookCallno);
		BookDesc bookDesc =  bookDescService.selectByExampleWithPress(bde).get(0);
		
		BookDesc bookBranch = bookDescService.selectByPrimaryKeyBranch(bookCallno);
		BookExample be = new BookExample();
		be.createCriteria().andBookCallnoEqualTo(bookCallno);
		List<Book> books = bookService.selectByExample(be);
		EditorExample ee = new EditorExample();
		ee.createCriteria().andBookCallnoEqualTo(bookDesc.getBookCallno());
		List<Editor> editors = editorService.selectByExampleWithWriter(ee);
		Press press = pressService.selectByPressId(bookDesc.getPressId());
		String adress = "("+press.getRegion().getCity().getProvince().getProvinceName()+" "+
                press.getRegion().getCity().getCityName()+" "+press.getRegion().getRegionName()+")";
		model.addAttribute("books",books);
		model.addAttribute("bookDesc",bookDesc);
		model.addAttribute("bookBranch",bookBranch);
		model.addAttribute("pressAdress", adress);
		model.addAttribute("editors",editors);
		return "ReaderBookDetails";
	}

}
