package jmu.hw.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jmu.hw.dao.BookDescMapper;
import jmu.hw.dao.ClcMapper;
import jmu.hw.po.BookDesc;
import jmu.hw.po.Clc;

public class TestBookDesc {

	@Test
	public void BookDesc(){
		  ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
	      BookDescMapper bookDescMapper=(BookDescMapper) ac.getBean("bookDescMapper");        
          List<BookDesc>bookDesc = bookDescMapper.selectByNamePart("%区块链%");
          System.out.println(bookDesc.size());
          for(int i=0;i< bookDesc.size();i++)
          	System.out.println( bookDesc.get(i).toString());
          
          BookDesc bd = new BookDesc();
          bd = bookDescMapper.selectByPrimaryKeyBranch("TP311.12");
          System.out.println(bd.getBranch().getBranchName()+"  "+ bd.getClc().getClcName());
	}
}
