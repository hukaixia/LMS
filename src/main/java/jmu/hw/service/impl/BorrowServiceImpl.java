package jmu.hw.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import jmu.hw.dao.BorrowMapper;
import jmu.hw.dao.ReaderMapper;
import jmu.hw.po.Borrow;
import jmu.hw.po.BorrowExample;
import jmu.hw.po.BorrowKey;
import jmu.hw.po.Reader;
import jmu.hw.service.BorrowService;
import jmu.hw.util.SendMail;

@Service("borrowService")
@EnableScheduling
public class BorrowServiceImpl implements BorrowService {

	@Autowired
	private BorrowMapper borrowMapper;
	@Autowired
	private ReaderMapper readerMapper;
	@Override
	public int deleteByExample(BorrowExample example) {
		
		return borrowMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(BorrowKey key) {
		
		return borrowMapper.deleteByPrimaryKey(key);
	}

	@Override
	public int insert(Borrow record) {
		
		return borrowMapper.insert(record);
	}

	@Override
	public int insertSelective(Borrow record) {
	
		return borrowMapper.insertSelective(record);
	}

	@Override
	public List<Borrow> selectByExample(BorrowExample example) {
		
		return borrowMapper.selectByExample(example);
	}

	@Override
	public Borrow selectByPrimaryKey(BorrowKey key) {
		
		return borrowMapper.selectByPrimaryKey(key);
	}

	@Override
	public int updateByExampleSelective(Borrow record, BorrowExample example) {
		
		return borrowMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(Borrow record, BorrowExample example) {
		
		return borrowMapper.updateByExample(record, example);
	}

	@Override
	public List<Borrow> selectByExampleWithReader(String part) {
		
		return borrowMapper.selectByExampleWithReader(part);
	}

	@Override
	public List<Borrow> selectByExampleWithBook(BorrowExample example) {
		
		return borrowMapper.selectByExampleWithBook(example);
	}

	@Override
	public int updateByPrimaryKeySelective(Borrow record) {
		
		return borrowMapper.updateByPrimaryKeySelective(record);
	}


	@Override
	public List<Borrow> selectByExampleWithIdPartDate(String readerId, String startDate, String endDate) {
		
		return borrowMapper.selectByExampleWithIdPartDate(readerId, startDate, endDate);
	}

	@Override
	public List<Borrow> selectByExampleWithIdPart(String readerId) {

		return borrowMapper.selectByExampleWithIdPart(readerId);
	}

	@Override
	public List<Borrow> selectByExampleWithUnitPartDate(String unitId, String startDate, String endDate) {

		return borrowMapper.selectByExampleWithUnitPartDate(unitId, startDate, endDate);
	}

	@Override
	public List<Borrow> selectByExampleWithUnitPart(String unitId) {
		// TODO Auto-generated method stub
		return borrowMapper.selectByExampleWithUnitPart(unitId);
	}

	@Override
	public List<Borrow> selectByExampleWithReaderDetail(String readerId) {
		// TODO Auto-generated method stub
		return borrowMapper.selectByExampleWithReaderDetail(readerId);
	}

	@Override
	@Scheduled(cron = "0 54 16 ? * *")
	public void EmailJob() {
		List<Borrow> borrow =borrowMapper.selectByExampleWithBook(null);
		System.out.println("发送邮件");
		//获取当前系统时间
		SimpleDateFormat myFormatter = new SimpleDateFormat("yyyy-MM-dd");  
		Date date =new Date();  
		String nowDate = myFormatter.format(date); 
		for(Borrow b:borrow){
			//代表该书尚未归还
			if(b.getReturnReadate()==null||b.getReturnReadate()== ""){
				 
				if(b.getReturnDate().compareTo(nowDate)<0){//超期
					System.out.println(b.getReader().getReaderEmail()+"发送成功");
					String emailTitle="JMU 图书馆管理系统";
					String emailContent=b.getReader().getUserName()+",您好,您借的图书"+b.getBook().getBookDesc().getBookName()+"已超期,请尽快归还并缴清罚款！";
					Reader reader = readerMapper.selectByPrimaryKey(b.getReaderId());
					reader.setReaderState("不正常");
					b.setBorrowState((short)1);
					readerMapper.updateByPrimaryKey(reader);
					borrowMapper.updateByPrimaryKey(b);
					System.out.println(reader.toString());
					try {
						SendMail.sendEmail(b.getReader().getReaderEmail(), emailTitle, emailContent);
					    System.out.println(b.getReader().getReaderEmail()+"发送成功");
					} catch (Exception e) {
						System.out.println("发送失败");
					}
					
				}
			}
		}
		
	}

	@Override
	public List<Borrow> selectByExampleBorrowWithReaderId(String readerId) {
		
		return borrowMapper.selectByExampleBorrowWithReaderId(readerId);
	}

	@Override
	public List<Borrow> selectByExampleBorrowWithBookName(String bookName) {
	
		return borrowMapper.selectByExampleBorrowWithBookName(bookName);
	}

	@Override
	public List<Borrow> selectByExampleBorrowWithBookId(String bookId) {
		
		return borrowMapper.selectByExampleBorrowWithBookId(bookId);
	}

	@Override
	public long readerBorrowBookNumber(String readerId, String borrowTypeId) {
		
		return borrowMapper.readerBorrowBookNumber(readerId, borrowTypeId);
	}

}
