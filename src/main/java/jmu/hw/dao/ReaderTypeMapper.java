package jmu.hw.dao;

import java.util.List;
import jmu.hw.po.ReaderType;
import jmu.hw.po.ReaderTypeExample;
import org.apache.ibatis.annotations.Param;

public interface ReaderTypeMapper {
    long countByExample(ReaderTypeExample example);

    int deleteByExample(ReaderTypeExample example);

    int deleteByPrimaryKey(String readerTypeId);

    int insert(ReaderType record);

    int insertSelective(ReaderType record);

    List<ReaderType> selectByExample(ReaderTypeExample example);

    ReaderType selectByPrimaryKey(String readerTypeId);

    int updateByExampleSelective(@Param("record") ReaderType record, @Param("example") ReaderTypeExample example);

    int updateByExample(@Param("record") ReaderType record, @Param("example") ReaderTypeExample example);

    int updateByPrimaryKeySelective(ReaderType record);

    int updateByPrimaryKey(ReaderType record);
}