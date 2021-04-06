package jmu.hw.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jmu.hw.dao.BorrowMapper;
import jmu.hw.dao.EditorMapper;
import jmu.hw.po.Editor;
import jmu.hw.po.EditorExample;

public class TestEditor {
	
	@Test
	public void testEditor(){
		  ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
	      EditorMapper  editorMapper=(EditorMapper) ac.getBean("editorMapper");
	      EditorExample ee = new EditorExample();
			 ee.createCriteria().andBookCallnoEqualTo("A164WY5");
			 int bb = editorMapper.deleteByExample(ee);
			 System.out.println(bb);
//	      List<Editor> editors = editorMapper.selectByExampleWithWriter(null);
//	      for(Editor e:editors)
//	    	  System.out.println(e.getWriter().getWriterName());
	}

}
