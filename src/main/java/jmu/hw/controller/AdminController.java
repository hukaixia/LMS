package jmu.hw.controller;

import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.ReaderEditor;
import org.springframework.http.HttpRange;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import jmu.hw.po.Admin;
import jmu.hw.po.Book;
import jmu.hw.po.BookDesc;
import jmu.hw.po.BookDescExample;
import jmu.hw.po.BookExample;
import jmu.hw.po.Borrow;
import jmu.hw.po.BorrowExample;
import jmu.hw.po.BorrowKey;
import jmu.hw.po.BorrowType;
import jmu.hw.po.Branch;
import jmu.hw.po.Clc;
import jmu.hw.po.Editor;
import jmu.hw.po.EditorExample;
import jmu.hw.po.Press;
import jmu.hw.po.Reader;
import jmu.hw.po.ReaderExample;
import jmu.hw.service.AdminService;
import jmu.hw.service.BookDescService;
import jmu.hw.service.BookService;
import jmu.hw.service.BorrowService;
import jmu.hw.service.BorrowTypeService;
import jmu.hw.service.BranchService;
import jmu.hw.service.ClcService;
import jmu.hw.service.EditorService;
import jmu.hw.service.PressService;
import jmu.hw.service.ReaderService;
import jmu.hw.util.ResponseMessage;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private BookDescService bookDescService;
	@Autowired
	private ReaderService readerService;
	@Autowired
	private BookService bookService;
	@Autowired
	private BorrowService borrowService;
	@Autowired
	private AdminService adminService;
	@Autowired
	private EditorService editorService;
	@Autowired
	private PressService pressService;
	@Autowired
	private BranchService branchService;
	@Autowired
	private BorrowTypeService borrowTypeService;
	@Autowired
	private ClcService clcService;
	//管理员登录
	@RequestMapping("/login")
	@ResponseBody
	public ResponseMessage Login(@RequestParam(value="adminId")String adminId,@RequestParam(value="userPswd")String userPswd,HttpSession session){
		Admin admin = adminService.selectByPrimaryKey(adminId);
		
		if(admin!=null && admin.getUserPswd().equals(userPswd))
		{
			session.setAttribute("loginReader", admin);
		    return ResponseMessage.success();
		}
		else
			return ResponseMessage.error();
	}
	
	//添加图书描述，同时根据馆藏数自动添加实体图书
	@RequestMapping("/addBook")
	public String AddBook(@RequestParam(value="bookName")String bookName,@RequestParam(value="bookIntro")String bookIntro,@RequestParam(value="ISBN")String ISBN,
			  @RequestParam(value="bookPrice")String bookPrice,@RequestParam(value="borrowTypeId")String borrowTypeId,@RequestParam(value="bookCallno")String bookCallno,
			  @RequestParam(value="wordNumber")Integer wordNumber,@RequestParam(value="publishDate")String publishDate,@RequestParam(value="collectionNumber")Short collectionNumber,
			  @RequestParam(value="pressId")String pressId,@RequestParam(value="clcId")String clcId,@RequestParam(value="writer")String writers,
			  @RequestParam(value="collectionDate")String collectionDate,@RequestParam(value="avaliableLoan")Short avaliableLoan,
			  @RequestParam(value="branchId")String branchId,MultipartFile bookImage,HttpServletRequest request,Model model) throws Exception, IOException{
		 
		System.out.println(borrowTypeId+"  "+pressId);
		String path = request.getSession().getServletContext().getRealPath("/static/images/");
		 File file=new File(path);
		 if(!file.exists())
			 file.mkdirs();
		 String filename = bookImage.getOriginalFilename();
		 String uuid = UUID.randomUUID().toString().replace("-", "");

		 filename = uuid+"_"+filename;
		 String f = ""+request.getContextPath()+"/static/images/"+filename;

         bookImage.transferTo(new  File(path,filename)); 
         BigDecimal Price = new BigDecimal(bookPrice);
         BookDesc bookDesc = new BookDesc(bookCallno, pressId, borrowTypeId,clcId, branchId, ISBN,
 				bookName, Price, wordNumber,  bookIntro, publishDate,
 				collectionDate,collectionNumber,avaliableLoan, f);
         
        adminService.adminAddBook(bookDesc, writers);

		return "BookShelf";
	}
	
	//回到Admin首页
	@RequestMapping("/adminPage")
	public String AdminPage(){
		return "AdminPage";
	}
	
	@RequestMapping("/infoManage")
	public String InfoManage(){
		return "ReaderManage";
	}
	@RequestMapping("/bookShelf")
	public String BookShelf(){
		return "BookShelf";
	}
	@RequestMapping("/bookManage")
	public String BookManage(){
		return "BookManage";
	}
	
	@RequestMapping("/adminHome")
	public String AdminHome(){
		
		return "AdminPage";
	}
	
	@RequestMapping("/renewManege")
	public String RenewManege(){
		
		return "BorrowManage";
	}
	
	@RequestMapping("/readerHandle")
	public String ReaderHandle(){
		return "ReaderHandle";
	}
	
	@RequestMapping("/printReport")
	public String PrintReport(){
		return "PrintReport";
	}
	 
	@RequestMapping("/handleFine")
	public String HandleFine(){
		return "HandleFine";
	}
	
	@RequestMapping("/huixian")
	public String HuiXian(@RequestParam(value="id") String bookCallno,Model model){
		BookDesc bookDesc = bookDescService.selectByPrimaryKey(bookCallno);
		EditorExample ee = new EditorExample();
		ee.createCriteria().andBookCallnoEqualTo(bookCallno);
		List<Editor> editor = editorService.selectByExampleWithWriter(ee);
		String writers = "";
		for(int i=0;i<editor.size();i++){
			if(i==0)
				writers+= editor.get(i).getWriter().getWriterName();
			else
				writers+= "/"+editor.get(i).getWriter().getWriterName();
		}
		model.addAttribute("bookDesc", bookDesc);
		model.addAttribute("writers", writers);

		return "AdminUpdateBookDesc";
	}
	//修改图书信息
	@RequestMapping(value="/updateBookDesc")
	public String UpdateBookDesc(@RequestParam(value="bookName")String bookName,@RequestParam(value="bookIntro")String bookIntro,@RequestParam(value="isbn")String ISBN,
			  @RequestParam(value="bookPrice")String bookPrice,@RequestParam(value="borrowTypeId")String borrowTypeId,@RequestParam(value="bookCallno")String bookCallno,
			  @RequestParam(value="wordNumber")Integer wordNumber,@RequestParam(value="publishDate")String publishDate,@RequestParam(value="collectionNumber")Short collectionNumber,
			  @RequestParam(value="pressId")String pressId,@RequestParam(value="clcId")String clcId,@RequestParam(value="writer")String writers,
			  @RequestParam(value="collectionDate")String collectionDate,@RequestParam(value="avaliableLoan")Short avaliableLoan,
			  @RequestParam(value="branchId")String branchId,MultipartFile bookImage,HttpServletRequest request,Model model) throws Exception, IOException{
		String f=null;
		if(bookImage!=null){
			String path = request.getSession().getServletContext().getRealPath("/static/images/");
			 File file=new File(path);
			 if(!file.exists())
				 file.mkdirs();
			 String filename = bookImage.getOriginalFilename();
			 String uuid = UUID.randomUUID().toString().replace("-", "");

			 filename = uuid+"_"+filename;
			 f = ""+request.getContextPath()+"/static/images/"+filename;

	         bookImage.transferTo(new  File(path,filename)); 
		}else
		{
			BookDesc bd = bookDescService.selectByPrimaryKey(bookCallno);
			f = bd.getBookImage();
		}
	   
       BigDecimal Price = new BigDecimal(bookPrice);
       BookDesc bookDesc = new BookDesc(bookCallno, pressId, borrowTypeId,clcId, branchId, ISBN,
				bookName, Price, wordNumber,  bookIntro, publishDate,
				collectionDate,collectionNumber,avaliableLoan, f);
       adminService.adminUpdateBook(bookDesc, writers);
		return "BookManage";
		
	}
	
	
	//添加读者,后端校验
	@ResponseBody
	@RequestMapping("/addReader")
	public ResponseMessage AddReader(@Valid Reader reader,BindingResult result){
		reader.setUserPswd("123456");
		if("R001".equals(reader.getReaderTypeId()))
		   reader.setUserRole("教师");
		else
			reader.setUserRole("学生");
		if(result.hasErrors()){
			List<FieldError> errors = result.getFieldErrors();

			return ResponseMessage.error().addObject("fieldErrors", errors);
		}else{
			int count = readerService.insert(reader);
			return ResponseMessage.success();
		}
			
		
	}
	
	//删除读者
	@ResponseBody
	@RequestMapping("/deleteReader")
	public ResponseMessage DeleteReader(@RequestParam(value="readerId")String readerId){
        int count = adminService.deleteReader(readerId);
        if(count!=0)
        	return ResponseMessage.success();
        else
        	return ResponseMessage.error();
	
	}
	
	   //获取读者信息，并显示到模态框中
		@ResponseBody
		@RequestMapping("/updateReaderAjax")
		public ResponseMessage UpdateReaderAjax(@RequestParam(value="readerId")String readerId){
		   ReaderExample re = new ReaderExample();
		   re.createCriteria().andReaderIdEqualTo(readerId);
	       Reader reader = readerService.selectByExampleByAll(re).get(0);
	       return ResponseMessage.success().addObject("reader", reader);
		
		}
		
		//修改读者信息
		@RequestMapping("/updateReader")
		public String UpdateReader(@RequestParam(value="readerId")String readerId, @RequestParam(value="unitId")String unitId,@RequestParam(value="readerState")String readerState,
				                            @RequestParam(value="readerTypeId")String readerTypeId,
				                            @RequestParam(value="userName")String userName,@RequestParam(value="userRole")String userRole){
		    
			Reader reader = readerService.selectByPrimaryKey(readerId);
			reader.setReaderTypeId(readerTypeId);
			reader.setUnitId(unitId);
			reader.setReaderState(readerState);
			reader.setUserName(userName);
			reader.setUserRole(userRole);
	        if("R001".equals(readerTypeId)){
	        	reader.setUserRole("教师");
	        }else
	        	reader.setUserRole("学生");
	        int count =readerService.updateByPrimaryKeySelective(reader);
	        return "ReaderManage";
		}
		
		   //删除某本具体图书，同时需要修改馆藏数和当前可供借出的数量。
		    @ResponseBody
			@RequestMapping("/deleteRealBook")
			public ResponseMessage DeleteRealBook(@RequestParam(value="bookId")Integer bookId){
				 Book book = bookService.selectByPrimaryKey(bookId);
				 BookDesc bookDesc = bookDescService.selectByPrimaryKey(book.getBookCallno());
				 short num = bookDesc.getCollectionNumber();
				 num=(short) (num-1);
				 bookDesc.setCollectionNumber(num);
				 short number = bookDesc.getAvaliableLoan();
				 number=(short) ( number-1);
				 bookDesc.setAvaliableLoan(number);
				 
				 int count = adminService.deleteRealBook(bookId, bookDesc);
				 if(count!=0)
			      return ResponseMessage.success();
				 else
					return ResponseMessage.error();
			}
		    
		    //删除图书描述，当该种书已有读者借阅时，不能删除
		    @ResponseBody
			@RequestMapping("/deleteBookDesc")
			public ResponseMessage DdeleteBookDesc(@RequestParam(value="bookDescId")String bookDescId){
	            BookDesc bookDesc = bookDescService.selectByPrimaryKey(bookDescId);
	            //该种图书是否有丢失
	            BookExample be = new BookExample();
	            be.createCriteria().andBookCallnoEqualTo(bookDescId).andBookDamageEqualTo(1);
	            int num = bookService.selectByExample(be).size();
                int b1 = bookDesc.getAvaliableLoan();
                int b2 = bookDesc.getCollectionNumber();
                System.out.println(b1+b2+num);
				 if((b1+num)==b2){
					 bookDescService.deleteByPrimaryKey(bookDescId);
					 return ResponseMessage.success();
				 }
			     
				 else
					return ResponseMessage.error();
			}
		    
		    //实体图书的更新，如果图书借阅状态变为不可借，则图书馆藏数减一，实体图书的图书状态为丢失，则借阅状态也为不可借。
		    @RequestMapping("/updateRealBook")
		    public String UpdateRealBook(@RequestParam(value="bookId")Integer bookId,@RequestParam(value="bookState")String bookState,@RequestParam(value="bookDamage")Integer bookDamage, HttpServletRequest request,Model model){
		    	
		    	Book book = bookService.selectByPrimaryKey(bookId);
				
		    	BookDescExample bde = new BookDescExample();
				bde.createCriteria().andBookCallnoEqualTo(book.getBookCallno());
				BookDesc bookDesc =  bookDescService.selectByExampleWithPress(bde).get(0);
				System.out.println(bookDamage);
				//该书丢失，则不可借
		    	if(bookDamage == 2)
		    		bookState = "不可借";
		    	
				//修改图书描述信息
				if(!bookState.equals(book.getBookState())){
					//由可借变为不可借
					if("不可借".equals(bookState)){
						short num = bookDesc.getAvaliableLoan();
						if(num<=0)
							;
						else
						num = (short) (num-1);
						bookDesc.setAvaliableLoan(num);
					}else{
						//由不可借变为可借
						short num = bookDesc.getAvaliableLoan();
						if(num<bookDesc.getCollectionNumber())
						num = (short) (num+1);
						bookDesc.setAvaliableLoan(num);
					}
				}
				
				//修改实体图书信息
		    	book.setBookState(bookState);		    
		    	book.setBookDamage(bookDamage);
		    	
				
				adminService.updateRealBook(book, bookDesc);
				
				//获取图书详细信息，并返回BookDetails页面
				BookDesc bookBranch = bookDescService.selectByPrimaryKeyBranch(book.getBookCallno());
				BookExample be = new BookExample();
				be.createCriteria().andBookCallnoEqualTo(book.getBookCallno());
				List<Book> books = bookService.selectByExample(be);
				model.addAttribute("books",books);
				model.addAttribute("bookDesc",bookDesc);
				model.addAttribute("bookBranch",bookBranch);
				return "BookDetails";
		    }
		    
		    //删除借阅记录
		    @ResponseBody
			@RequestMapping(value="/deleteBorrow")
			 public ResponseMessage DeleteBorrow(@RequestParam(value="bookId")Integer bookId,@RequestParam(value="readerId")String readerId,
					                             @RequestParam(value="borrowDate")String borrowDate){
					
		    	   BorrowKey bk = new BorrowKey(bookId,readerId,borrowDate);
		    	   int count = borrowService.deleteByPrimaryKey(bk);
		    	   if(count!=0)
					return ResponseMessage.success();
		    	   else
		    		  return ResponseMessage.error();

		     }
		    
		    //修改借阅记录,只要是修改到期时间
			@RequestMapping(value="/updateBorrow")
			 public String UpdateBorrow(@RequestParam(value="bookId")Integer bookId,@RequestParam(value="readerId")String readerId,
					                             @RequestParam(value="borrowDate")String borrowDate,@RequestParam(value="returnDate")String returnDate){
					
		    	   BorrowKey bk = new BorrowKey(bookId,readerId,borrowDate);
		    	   Borrow b = borrowService.selectByPrimaryKey(bk);
		    	   b.setReturnDate(returnDate);
		    	   int count = borrowService.updateByPrimaryKeySelective(b);
		    	   return "BorrowManage";

		}
}



