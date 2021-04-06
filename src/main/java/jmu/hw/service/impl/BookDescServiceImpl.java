package jmu.hw.service.impl;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import jmu.hw.dao.BookDescMapper;
import jmu.hw.po.BookDesc;
import jmu.hw.po.BookDescExample;
import jmu.hw.service.BookDescService;

@Service("bookDescService")
@EnableScheduling
public class BookDescServiceImpl implements BookDescService {

	@Autowired
	private BookDescMapper bookDescMapper;
	
	@Override
	public int deleteByPrimaryKey(String bookCallno) {
		
		return bookDescMapper.deleteByPrimaryKey(bookCallno);
	}

	@Override
	public int insert(BookDesc record) {
		// TODO Auto-generated method stub
		return bookDescMapper.insert(record);
	}

	@Override
	public int insertSelective(BookDesc record) {
		// TODO Auto-generated method stub
		return bookDescMapper.insertSelective(record);
	}

	@Override
	public List<BookDesc> selectByExample(BookDescExample example) {
		// TODO Auto-generated method stub
		return bookDescMapper.selectByExample(example);
	}

	@Override
	public BookDesc selectByPrimaryKey(String bookCallno) {
		// TODO Auto-generated method stub
		return bookDescMapper.selectByPrimaryKey(bookCallno);
	}

	@Override
	public int updateByExampleSelective(BookDesc record, BookDescExample example) {
		// TODO Auto-generated method stub
		return bookDescMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(BookDesc record, BookDescExample example) {
		// TODO Auto-generated method stub
		return bookDescMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(BookDesc record) {
		// TODO Auto-generated method stub
		return bookDescMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(BookDesc record) {
		// TODO Auto-generated method stub
		return bookDescMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<BookDesc> selectByExampleWithPress(BookDescExample example) {
		// TODO Auto-generated method stub
		return bookDescMapper.selectByExampleWithPress(example);
	}

	//索书号模糊查询
	@Override
	public List<BookDesc> selectByCallnoPart(String callno) {
		// TODO Auto-generated method stub
		return bookDescMapper.selectByCallnoPart(callno);
	}

	//书内容模糊查询
	@Override
	public List<BookDesc> selectByContentPart(String callno) {
		// TODO Auto-generated method stub
		return bookDescMapper.selectByContentPart(callno);
	}
    //ISBN号模糊查询
	@Override
	public List<BookDesc> selectByISBNPart(String callno) {
		// TODO Auto-generated method stub
		return bookDescMapper.selectByISBNPart(callno);
	}

	//书名模糊查询
	@Override
	public List<BookDesc> selectByNamePart(String callno) {
		
		return bookDescMapper.selectByNamePart(callno);
	}

	@Override
	public BookDesc selectByPrimaryKeyBranch(String bookCallno) {
	
		return bookDescMapper.selectByPrimaryKeyBranch(bookCallno);
	}

	//新书上架后60天自动变成中文图书或者外文图书
	@Override
	@Scheduled(cron = "0 21 13 ? * *")
	public void BookDescJob() {
		BookDescExample bde = new BookDescExample();
		bde.createCriteria().andBorrowTypeIdBetween("B2", "B3");
		List<BookDesc> bookDesc = bookDescMapper.selectByExample(bde);
		for(BookDesc bd:bookDesc){
			SimpleDateFormat myFormatter = new SimpleDateFormat("yyyy-MM-dd");  
			Date  date = myFormatter.parse(bd.getCollectionDate(),new ParsePosition(0));
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);
			calendar.add(Calendar.DATE, 60);
			Date resultDate = calendar.getTime();
			String r = myFormatter.format(resultDate);
			//获取当前时间
			Date d = new Date();
			String nowDate = myFormatter.format(d);
			if(nowDate.compareTo(r)>=0){
				if("B3".equals(bd.getBorrowTypeId()))
					bd.setBorrowTypeId("B1");
				else
					bd.setBorrowTypeId("B2");
				
				bookDescMapper.updateByPrimaryKey(bd);
			}
			
		}
		
	}

}
