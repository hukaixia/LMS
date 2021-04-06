package jmu.hw.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jmu.hw.dao.BookMapper;
import jmu.hw.po.Book;

//import jmu.hw.dao.BookDescMapper;
//import jmu.hw.dao.ClcMapper;
//import jmu.hw.po.BookDesc;
//import jmu.hw.po.Clc;
//import jmu.hw.po.ClcExample;

public class TestClc {
	  @Test
	    public void testTransfer(){
//	        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
//	        ClcMapper clcMapper=(ClcMapper) ac.getBean("clcMapper");        
//            List<Clc> clc = clcMapper.selectByPart();
//            for(int i=0;i<clc.size();i++)
//            	System.out.println(clc.get(i).getClcName());
//            
//            List<Clc> clc1 = clcMapper.selectByClcId();
//            for(int i=0;i<clc1.size();i++)
//            	System.out.println(clc1.get(i).getClcName());
//            
	    }
	    
	  @Test
	    public void TestBookDesc(){
	        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
	        BookMapper bookMapper=(BookMapper) ac.getBean("bookMapper");        
          List<Book> clc = bookMapper.selectByExample(null);
          for(int i=0;i<clc.size();i++)
          	System.out.println(clc.get(i).getBookDamage());
          
	    }
	    
}
