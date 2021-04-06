package jmu.hw.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jmu.hw.dao.BookDescMapper;
import jmu.hw.dao.BorrowMapper;
import jmu.hw.po.BookDesc;
import jmu.hw.po.Borrow;
import jmu.hw.po.BorrowExample;

public class TestBorrow {
	@Test
	public void Borrow(){
		  ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
	      BorrowMapper  borrowMapper=(BorrowMapper) ac.getBean("borrowMapper");
//          BorrowExample be = new BorrowExample();
//  		 be.createCriteria().andReaderIdLike("2017%");
  	//	List<Borrow> borrow = borrowMapper.selectByExampleWithBook(null);
  //      be.createCriteria().and;
          Borrow b = new Borrow();
    //      borrow.set
	//  List<Borrow> borrow =  borrowMapper.selectByExampleWithUnitPartDate("%m001%", "2020-06-15", "2020-06-15");
          BorrowExample be = new BorrowExample();
          be.createCriteria().andBookIdEqualTo(12);
          List<Borrow> borrow =  borrowMapper.selectByExampleBorrowWithBookName("%区块链%");
          System.out.println( borrow .size());
          for(int i=0;i<  borrow .size();i++)
          	System.out.println(  borrow .get(i).getReader().getReaderEmail());
          
           long num = borrowMapper.readerBorrowBookNumber("201821122035", "B3");
           System.out.println(num);
          
        
	}
}

