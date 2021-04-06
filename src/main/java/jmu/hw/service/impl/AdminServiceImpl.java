package jmu.hw.service.impl;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jmu.hw.dao.AdminMapper;
import jmu.hw.dao.BookDescMapper;
import jmu.hw.dao.BookMapper;
import jmu.hw.dao.BorrowMapper;
import jmu.hw.dao.BorrowTypeMapper;
import jmu.hw.dao.EditorMapper;
import jmu.hw.dao.FineDetailMapper;
import jmu.hw.dao.FineMapper;
import jmu.hw.dao.ReaderMapper;
import jmu.hw.dao.WriterMapper;
import jmu.hw.po.Admin;
import jmu.hw.po.AdminExample;
import jmu.hw.po.Book;
import jmu.hw.po.BookDesc;
import jmu.hw.po.Borrow;
import jmu.hw.po.BorrowExample;
import jmu.hw.po.BorrowType;
import jmu.hw.po.Editor;
import jmu.hw.po.EditorExample;
import jmu.hw.po.Fine;
import jmu.hw.po.FineDetail;
import jmu.hw.po.FineDetailKey;
import jmu.hw.po.Reader;
import jmu.hw.po.Writer;
import jmu.hw.service.AdminService;
import jmu.hw.service.BookDescService;

@Service("adminService")
public class AdminServiceImpl implements AdminService{

	@Autowired
	private AdminMapper adminMapper;
	@Autowired
	private BookMapper bookMapper;
	@Autowired
	private BookDescMapper bookDescMapper;
	@Autowired 
	private ReaderMapper readerMapper;
	@Autowired
	private BorrowMapper borrowMapper;
	@Autowired
	private WriterMapper writerMapper;
	@Autowired
	private EditorMapper editorMapper;
	@Autowired
	private BorrowTypeMapper borrowTypeMapper;
	@Autowired
	private FineMapper fineMapper;
	@Autowired
	private FineDetailMapper fineDetailMapper;
	@Override
	public Admin selectByPrimaryKey(String adminId) {
		
		return adminMapper.selectByPrimaryKey(adminId);
	}
	@Override
	public List<Admin> selectByExample(AdminExample example) {
		
		return adminMapper.selectByExample(example);
	}
	
	
	//更新实体图书 
	@Override
	@Transactional
	public void updateRealBook(Book book, BookDesc bookDesc) {
		bookMapper.updateByPrimaryKey(book);
		bookDescMapper.updateByPrimaryKey(bookDesc);
		
	}
	
	//删除实体图书
	@Override
	@Transactional
	public int deleteRealBook(Integer bookId, BookDesc bookDesc) {
		int count = bookMapper.deleteByPrimaryKey(bookId);
		bookDescMapper.updateByPrimaryKey(bookDesc);
		return count;
	}
	
	//删除读者
	@Override
	@Transactional
	public int deleteReader(String readerId) {
		BorrowExample be = new BorrowExample();
		be.createCriteria().andReaderIdEqualTo(readerId);
		int count = borrowMapper.deleteByExample(be);
		readerMapper.deleteByPrimaryKey(readerId);
		return count;
	}

	//读者借阅图书
	@Override
	@Transactional
	public int readerBorrowBook(Book book, BookDesc bookDesc, Borrow borrow) {
		borrowMapper.insertSelective(borrow);
		bookDescMapper.updateByPrimaryKeySelective(bookDesc);
		int count =bookMapper.updateByPrimaryKey(book);
		return count;
	}
	//读者归还图书，并判断是否罚款
	@Override
	@Transactional
	public int readerReturnBook(Book book, BookDesc bookDesc, Borrow borrow,Integer days) {
		//如果该书丢失，则还书失败
		if(book.getBookDamage()==2)
			return 0;
		borrowMapper.updateByPrimaryKeySelective(borrow);
		bookDescMapper.updateByPrimaryKeySelective(bookDesc);
		int count =bookMapper.updateByPrimaryKey(book);
		//如果days大于0，则计算罚款金额。
		if(days>0)
		{
			BorrowType bt = borrowTypeMapper.selectByPrimaryKey(bookDesc.getBorrowTypeId());
			BigDecimal price = bt.getFineUnivalence();
			BigDecimal day = new BigDecimal(days);
			price = price.multiply(day);
			double f1 = price.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
			System.out.println(price);
			Fine fine = new Fine();
			Date date =new Date();
			SimpleDateFormat myFormatter = new SimpleDateFormat("yyyy-MM-dd");  
			String fineTime = myFormatter.format(date);
			fine.setFineTime(fineTime);
			fine.setFineTotal(new BigDecimal(f1));
			fine.setBookId(borrow.getBookId());
			fine.setReaderId(borrow.getReaderId());
			
			
			//插入罚款信息和罚款明细信息
		    fineMapper.insertSelective(fine);	
		    int fineId = fine.getFineId();
		    FineDetail fineDetail = new FineDetail();
			fineDetail.setFineDetailId(0);
			fineDetail.setFineId(fineId);
			fineDetail.setFineUnivalence(price);
			fineDetailMapper.insertSelective(fineDetail);
		}
		return count;
	}
	
	//管理员添加图书
	@Override
	@Transactional
	public int adminAddBook(BookDesc bookDesc, String writers) {
	  int count=bookDescMapper.insert(bookDesc);
	  //添加图书数据
	  int num = bookDesc.getCollectionNumber();
	  //添加实体图书数据
	  while(num>0){
		  Book book = new Book();
		  book.setBookCallno(bookDesc.getBookCallno());
		  book.setBookState("可借");
		  book.setBookDamage(0);
		  bookMapper.insertSelective(book);
		  num--;
	  }
	  //添加作者数据
	    String []writer = writers.split("/");
	    for(int i=0;i<writer.length;i++){
	    	Writer ww = new Writer();
	    	ww.setWriterName(writer[i]);
	    	writerMapper.insertSelective(ww);
	    	int writerId = ww.getWriterId();
	    	Editor e = new Editor();
    		e.setBookCallno(bookDesc.getBookCallno());
    		e.setWriterId(writerId);
	    	if(i==0){
	    		e.setEditorRole("主编");
	    	}else
	    		e.setEditorRole("参编");
	    	editorMapper.insertSelective(e);
	    }
		return count;
	}
	
	//管理员修改图书
	@Override
	@Transactional
	public int adminUpdateBook(BookDesc bookDesc, String writers) {
		 EditorExample ee = new EditorExample();
		 ee.createCriteria().andBookCallnoEqualTo(bookDesc.getBookCallno());
		 int bb = editorMapper.deleteByExample(ee);
		 
		  //添加作者数据
		    String []writer = writers.split("/");
		    for(int i=0;i<writer.length;i++){
		    	Writer ww = new Writer();
		    	ww.setWriterName(writer[i]);
		    	int AA =writerMapper.insertSelective(ww);
		    	int writerId = ww.getWriterId();
		    	Editor e = new Editor();
	    		e.setBookCallno(bookDesc.getBookCallno());
	    		e.setWriterId(writerId);
		    	if(i==0){
		    		e.setEditorRole("主编");
		    	}else
		    		e.setEditorRole("参编");
                editorMapper.insert(e);

		    }
		    int count=bookDescMapper.updateByPrimaryKeySelective(bookDesc);
			return count;

	}
	@Override
	@Transactional
	public int adminHandelFine(Fine fine, FineDetail fineDetail) {
		FineDetailKey fdk = new FineDetailKey();
		fdk.setFineDetailId(fineDetail.getFineDetailId());
		fdk.setFineId(fine.getFineId());
		FineDetail fd = fineDetailMapper.selectByPrimaryKey(fdk);
		if(fd==null){
			fineDetailMapper.insertSelective(fineDetail);
			fineMapper.updateByPrimaryKeySelective(fine);
		}else{
			BigDecimal bd = fine.getFineTotal().subtract(fd.getFineUnivalence());
			fine.setFineTotal(bd);
			fineDetailMapper.updateByPrimaryKeySelective(fineDetail);
			fineMapper.updateByPrimaryKeySelective(fine);
		}
		return 0;
	}
	@Override
	@Transactional
	public int adminAddFine(Fine fine, FineDetail fineDetail) {
		fineMapper.insertSelective(fine);
		Integer fineId = fine.getFineId();
		fineDetail.setFineId(fineId);
		fineDetailMapper.insertSelective(fineDetail);
		return 0;
	}

}
