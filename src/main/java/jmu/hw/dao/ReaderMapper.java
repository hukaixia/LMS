package jmu.hw.dao;

import java.util.List;
import jmu.hw.po.Reader;
import jmu.hw.po.ReaderExample;
import org.apache.ibatis.annotations.Param;

public interface ReaderMapper {
    long countByExample(ReaderExample example);

    int deleteByExample(ReaderExample example);

    int deleteByPrimaryKey(String readerId);

    int insert(Reader record);

    int insertSelective(Reader record);

    List<Reader> selectByExample(ReaderExample example);
    
    List<Reader> selectByExampleByAll(ReaderExample example);
    
    Reader selectByPrimaryKey(String readerId);

    int updateByExampleSelective(@Param("record") Reader record, @Param("example") ReaderExample example);

    int updateByExample(@Param("record") Reader record, @Param("example") ReaderExample example);

    int updateByPrimaryKeySelective(Reader record);

    int updateByPrimaryKey(Reader record);

	List<Reader> selectByExampleByUnitPart(String unitName);
}