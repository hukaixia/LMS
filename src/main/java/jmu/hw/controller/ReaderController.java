package jmu.hw.controller;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import jmu.hw.po.Book;
import jmu.hw.po.BookDesc;
import jmu.hw.po.Borrow;
import jmu.hw.po.BorrowKey;
import jmu.hw.po.BorrowRequire;
import jmu.hw.po.BorrowRequireExample;
import jmu.hw.po.BorrowRequireKey;
import jmu.hw.po.BorrowType;
import jmu.hw.po.Fine;
import jmu.hw.po.Reader;
import jmu.hw.po.ReaderExample;
import jmu.hw.service.AdminService;
import jmu.hw.service.BookDescService;
import jmu.hw.service.BookService;
import jmu.hw.service.BorrowRequireService;
import jmu.hw.service.BorrowService;
import jmu.hw.service.FineService;
import jmu.hw.service.ReaderService;
import jmu.hw.util.ResponseMessage;

@Controller
@RequestMapping("/reader")
public class ReaderController {

	@Autowired
	private ReaderService readerService;
	@Autowired
	private BookDescService bookDescService;
	@Autowired
	private BookService bookService;
	@Autowired
	private BorrowRequireService borrowRequireService;
	@Autowired
	private BorrowService borrowService;

	@Autowired
	private AdminService adminService;

	@Autowired
	private FineService fineService;
	// 读者登录校验
	@RequestMapping("/login")
	@ResponseBody
	public ResponseMessage login(@RequestParam("readerId") String readerId, @RequestParam("userPswd") String userPswd,
			HttpSession session) {

		ReaderExample re = new ReaderExample();
		re.createCriteria().andReaderIdEqualTo(readerId);
		Reader reader = readerService.selectByExampleByAll(re).get(0);
		if (reader == null || !userPswd.equals(userPswd)) {
			return ResponseMessage.error();
		} else {

			session.setAttribute("loginReader", reader);
			return ResponseMessage.success();
		}
	}

	// 读者退出系统
	@ResponseBody
	@RequestMapping("/logout")
	public ResponseMessage Logout(HttpSession session) {
		session.invalidate();
		return ResponseMessage.success();
	}

	// 获取读者信息
	@ResponseBody
	@RequestMapping("/readerList")
	public ResponseMessage ReaderList(@RequestParam(value = "pn", defaultValue = "1") Integer pn,
			@RequestParam(value = "searchContent") String searchContent,
			@RequestParam(value = "radioValue") String radioValue) {
		PageHelper.startPage(pn, 15);
		ReaderExample re = new ReaderExample();
		List<Reader> readers = new ArrayList<Reader>();
		if ("userName".equals(radioValue)) {
			re.createCriteria().andUserNameLike("%" + searchContent + "%");
			readers = readerService.selectByExampleByAll(re);
		} else if ("readerId".equals(radioValue)) {
			re.createCriteria().andReaderIdLike("%" + searchContent + "%");
			readers = readerService.selectByExampleByAll(re);
		} else if ("userRole".equals(radioValue)) {
			re.createCriteria().andUserRoleLike("%" + searchContent + "%");
			readers = readerService.selectByExampleByAll(re);
		} else if ("readerState".equals(radioValue)) {
			re.createCriteria().andReaderStateLike("%" + searchContent + "%");
			readers = readerService.selectByExampleByAll(re);
		} else if ("unitName".equals(radioValue)) {
			readers = readerService.selectByExampleByUnitPart("%" + searchContent + "%");
		} else
			readers = readerService.selectByExampleByAll(null);

		// 使用pageinfo包装,封装了详细的信息,传入连续显示的页数
		PageInfo page = new PageInfo(readers, 5);
		return ResponseMessage.success().addObject("mylist", page);
	}

	// 用户id校验
	@ResponseBody
	@RequestMapping("/readerIdCheck")
	public ResponseMessage ReaderIdCheck(@RequestParam("readerId") String readerId) {
		Reader reader = readerService.selectByPrimaryKey(readerId);
		if (reader == null)
			return ResponseMessage.success();
		else
			return ResponseMessage.error();
	}

	// 退出回到登录界面
	@RequestMapping("/returnLogin")
	public String ReturnLogin() {
		return "LoginPage";
	}

	// 用户修改个人信息
	@RequestMapping("/readerUpdate")
	public String readerUpdate(@RequestParam("userPswd") String userPswd,
			@RequestParam("readerEmail") String readerEmail, @RequestParam("readerPhone") String readerPhone,
			HttpSession session) {
		Reader reader = (Reader) session.getAttribute("loginReader");
		reader.setReaderEmail(readerEmail);
		reader.setReaderPhone(readerPhone);
		reader.setUserPswd(userPswd);
		readerService.updateByPrimaryKeySelective(reader);
		session.setAttribute("loginReader", reader);
		return "PersonalCenter";
	}

	// 读者罚款信息
	@ResponseBody
	@RequestMapping("/fineList")
	public ResponseMessage fineList(@RequestParam(value = "pn", defaultValue = "1") Integer pn,HttpSession session) {
		PageHelper.startPage(pn, 15);
		Reader reader =(Reader) session.getAttribute("loginReader");
		List<Fine> fine = fineService.selectByExampleByReaderIdPart(reader.getReaderId());
		PageInfo page = new PageInfo(fine, 5);
		return ResponseMessage.success().addObject("mylist", page);
	}

	// 读者借阅图书
	@ResponseBody
	@RequestMapping("/readerBorrow")
	public ResponseMessage ReaderBorrow(@RequestParam("bookId") Integer bookId, HttpSession session) {
		Book book = bookService.selectByPrimaryKey(bookId);
		BookDesc bookDesc = bookDescService.selectByPrimaryKey(book.getBookCallno());
		Reader reader = (Reader) session.getAttribute("loginReader");
		// 判断用户是否可以借书,状态为正常才可以借书
		if ("不正常".equals(reader.getReaderState()))
			return ResponseMessage.error();

		// 借阅要求，在判断用户该类型图书是否超多最多可借阅的册数，若超过，也不可借。
		BorrowRequireKey brq = new BorrowRequireKey(bookDesc.getBorrowTypeId(), reader.getReaderTypeId());
		BorrowRequire borrowRequire = borrowRequireService.selectByPrimaryKey(brq);
		// 读者类型ID
		String readerTypeId = reader.getReaderTypeId();

		// 最多可以借书数
		int maxBooks = borrowRequire.getBookNumber();

		// 该读者该类型的书已借未归还的书
		long borrowNumber = borrowService.readerBorrowBookNumber(reader.getReaderId(), bookDesc.getBorrowTypeId());
		// 超过最多可节约的册数时，则不可借
		if (borrowNumber > maxBooks)
			return ResponseMessage.error();

		// 获取借阅时间，并计算实际归还时间
		SimpleDateFormat myFormatter = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		String d = myFormatter.format(date);
		Date borrowDate = myFormatter.parse(d, new ParsePosition(0));
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(borrowDate);
		calendar.add(Calendar.DATE, borrowRequire.getBorrowPeriod());
		Date returnDate = calendar.getTime();
		String r = myFormatter.format(returnDate);
		BorrowRequireExample bre = new BorrowRequireExample();
		bre.createCriteria().andReaderTypeIdEqualTo(readerTypeId);
		List<BorrowRequire> bq = borrowRequireService.selectByExample(bre);

		// 借阅处理
		Borrow borrow = new Borrow(bookId, reader.getReaderId(), d, r, (short) 0);
		// 修改读者状态
		book.setBookState("不可借");
		short num = bookDesc.getAvaliableLoan();
		num = (short) (num - 1);
		if (num <= 0)
			num = 0;
		bookDesc.setAvaliableLoan(num);

		// borrowService.insertSelective(borrow);
		// bookDescService.updateByPrimaryKeySelective(bookDesc);
		// int count =bookService.updateByPrimaryKey(book);
		int count = adminService.readerBorrowBook(book, bookDesc, borrow);
		return ResponseMessage.success();
	}

	// 读者归还图书，当天借的图书不能当天还,并判断是否逾期还书，并计算罚款金额
	@ResponseBody
	@RequestMapping(value = "/retuenBook")
	public ResponseMessage RetuenBook(@RequestParam(value = "bookId") Integer bookId,
			@RequestParam(value = "readerId") String readerId, @RequestParam(value = "borrowDate") String borrowDate) {

		BorrowKey bk = new BorrowKey(bookId, readerId, borrowDate);
		// 获取归还时间
		SimpleDateFormat myFormatter = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		String d = myFormatter.format(date);
		// 当天借的图书不能当天归还
		if (d.equals(borrowDate))
			return ResponseMessage.error();

		Borrow borrow = borrowService.selectByPrimaryKey(bk);

		// 修改借阅信息
		borrow.setReturnReadate(d);
		// 同时修改书的信息
		Book book = bookService.selectByPrimaryKey(bookId);
		book.setBookState("可借");

		// 修改图书可供借出的数量
		BookDesc bookDesc = bookDescService.selectByPrimaryKey(book.getBookCallno());
		short num = bookDesc.getAvaliableLoan();
		num = (short) (num + 1);
		if (num >= bookDesc.getCollectionNumber())
			num = bookDesc.getCollectionNumber();
		System.out.println(num);
		bookDesc.setAvaliableLoan(num);

		// 计算读者还书时间与图书到期时间相差多久
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		long time1 = cal.getTimeInMillis();
		// 获取到期时间
		Date date1 = myFormatter.parse(borrow.getReturnDate(), new ParsePosition(0));
		cal.setTime(date1);
		long time2 = cal.getTimeInMillis();
		long between_days = (time1 - time2) / (1000 * 3600 * 24);
		Integer days = Integer.parseInt(String.valueOf(between_days));
		if (days < 0)
			days = 0;
		else
			borrow.setBorrowState((short) 1);
		// bookDescService.updateByPrimaryKey(bookDesc);
		// bookService.updateByPrimaryKey(book);
		// int count = borrowService.updateByPrimaryKeySelective(borrow);
		int count = adminService.readerReturnBook(book, bookDesc, borrow, days);

		if (count != 0)
			return ResponseMessage.success();
		else
			return ResponseMessage.error();

	}

	// 读者续借图书
	@ResponseBody
	@RequestMapping(value = "/renewBook")
	public ResponseMessage RenewBook(@RequestParam(value = "bookId") Integer bookId,
			@RequestParam(value = "readerId") String readerId, @RequestParam(value = "borrowDate") String borrowDate) {
		Reader reader = readerService.selectByPrimaryKey(readerId);
		Book book = bookService.selectByPrimaryKey(bookId);
		BookDesc bookDesc = bookDescService.selectByPrimaryKey(book.getBookCallno());

		//如果图书丢失，不可续借
		if(book.getBookDamage()==2)
			return ResponseMessage.error();
		// 如果读者状态为不正常，则不能续借,新书也不能续借,已续借过的也不能续借,超期未归还的也不能续借
		if ("不正常".equals(reader.getReaderState()) || "B3".equals(bookDesc.getBorrowTypeId())
				|| "B4".equals(bookDesc.getBorrowTypeId()))
			return ResponseMessage.error();

		BorrowKey bk = new BorrowKey(bookId, readerId, borrowDate);
		Borrow borrow = borrowService.selectByPrimaryKey(bk);

		// 续借一次后不能再续借
		if (1 == borrow.getRenewState())
			return ResponseMessage.error();

		BorrowRequireKey brq = new BorrowRequireKey(bookDesc.getBorrowTypeId(), reader.getReaderTypeId());
		BorrowRequire borrowRequire = borrowRequireService.selectByPrimaryKey(brq);
		// 修改到期时间
		SimpleDateFormat myFormatter = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		String d = borrow.getReturnDate();
		Date realDate = myFormatter.parse(d, new ParsePosition(0));
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(realDate);
		calendar.add(Calendar.DATE, borrowRequire.getRenewalDays());
		Date reaDate = calendar.getTime();

		// 最后计算得到的到期时间
		String returnReaDate = myFormatter.format(reaDate);

		borrow.setReturnDate(returnReaDate);
		borrow.setRenewState((short) 1);
		// 修改借阅信息

		int count = borrowService.updateByPrimaryKeySelective(borrow);
		if (count != 0)
			return ResponseMessage.success();
		else
			return ResponseMessage.error();

	}

}
