package jmu.hw.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import jmu.hw.po.Fine;
import jmu.hw.po.FineExample;

public interface FineService {

	   int deleteByExample(FineExample example);

	    int deleteByPrimaryKey(Integer fineId);

	    int insert(Fine record);

	    int insertSelective(Fine record);

	    List<Fine> selectByExample(FineExample example);

	    Fine selectByPrimaryKey(Integer fineId);
	    
	    List<Fine> selectByExampleWithAll(FineExample example);
	    
	    List<Fine>   selectByExampleByReaderIdPart(String readerId);
	    
	    List<Fine>  selectByExampleByUserNamePart(String userName);
	    
	    List<Fine>  selectByExampleByBookNamePart(String bookName);
	    
	    List<Fine>  selectByExampleByBookId(Integer bookId);
	    
	    int updateByExample(@Param("record") Fine record, @Param("example") FineExample example);

	    int updateByPrimaryKey(Fine record);
}
