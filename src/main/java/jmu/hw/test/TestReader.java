package jmu.hw.test;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.propertyeditors.ReaderEditor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jmu.hw.dao.FineMapper;
import jmu.hw.dao.PressMapper;
import jmu.hw.dao.ReaderMapper;
import jmu.hw.dao.WriterMapper;
import jmu.hw.po.Fine;
import jmu.hw.po.Press;
import jmu.hw.po.Reader;
import jmu.hw.po.ReaderExample;
import jmu.hw.po.Writer;



public class TestReader {
	 @Test
	    public void testTransfer(){
	        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
	        ReaderMapper readerMapper=(ReaderMapper) ac.getBean("readerMapper"); 
//	        ReaderExample re = new ReaderExample();
//            List<Reader> readers = readerMapper.selectByExampleByUnitPart("%计算机%");
//            for(int i=0;i<readers.size();i++)
//         	System.out.println(readers.get(i).getUserName());
	        ReaderExample fe = new ReaderExample();
	        fe.createCriteria().andReaderEmailEqualTo("201821122003");
	        List<Reader> reader = readerMapper.selectByExample(fe);
          for(int i=0;i<reader.size();i++)
       	System.out.println(reader.get(i).getUserName());
         
	    }
	 
	 @Test
	    public void testWriter(){
	        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
	        WriterMapper writerMapper=( WriterMapper ) ac.getBean("writerMapper"); 
//	        ReaderExample re = new ReaderExample();
//         List<Reader> readers = readerMapper.selectByExampleByUnitPart("%计算机%");
//         for(int i=0;i<readers.size();i++)
//      	System.out.println(readers.get(i).getUserName());
            Writer writer = new Writer();
            writer.setWriterName("11");
           writerMapper.insertSelective(writer);
           int id= writer.getWriterId();
            System.out.println(id);
	    }
	 @Test
	    public void testFine(){
	        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
	        FineMapper fineMapper=( FineMapper ) ac.getBean("fineMapper"); 
//	        ReaderExample re = new ReaderExample();
//      List<Reader> readers = readerMapper.selectByExampleByUnitPart("%计算机%");
//      for(int i=0;i<readers.size();i++)
//   	System.out.println(readers.get(i).getUserName());
            List<Fine> fine = fineMapper.selectByExampleByUserNamePart("%Sa%");
           for(Fine f:fine)
        	   System.out.println(f.getFineDetail().size());
	    }
	 
	 @Test
	    public void testPress(){
	        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
	        PressMapper pressMapper=( PressMapper ) ac.getBean("pressMapper"); 

            Press press = pressMapper.selectByPressId("p001");
            System.out.println(press.getRegion().getCity().getProvince().getProvinceName());
	 }
}
