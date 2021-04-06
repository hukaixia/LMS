package jmu.hw.dao;

import java.util.List;
import jmu.hw.po.Fine;
import jmu.hw.po.FineExample;
import org.apache.ibatis.annotations.Param;

public interface FineMapper {
	long countByExample(FineExample example);

	int deleteByExample(FineExample example);

	int deleteByPrimaryKey(Integer fineId);

	int insert(Fine record);

	int insertSelective(Fine record);

	List<Fine> selectByExample(FineExample example);

	Fine selectByPrimaryKey(Integer fineId);

	List<Fine> selectByExampleByReaderIdPart(String readerId);

	List<Fine> selectByExampleByUserNamePart(String userName);

	List<Fine> selectByExampleByBookId(Integer bookId);

	List<Fine> selectByExampleByBookNamePart(String bookName);

	List<Fine> selectByExampleWithAll(FineExample example);

	int updateByExampleSelective(@Param("record") Fine record, @Param("example") FineExample example);

	int updateByExample(@Param("record") Fine record, @Param("example") FineExample example);

	int updateByPrimaryKeySelective(Fine record);

	int updateByPrimaryKey(Fine record);
}