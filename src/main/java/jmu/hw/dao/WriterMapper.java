package jmu.hw.dao;

import java.util.List;
import jmu.hw.po.Writer;
import jmu.hw.po.WriterExample;
import org.apache.ibatis.annotations.Param;

public interface WriterMapper {
    long countByExample(WriterExample example);

    int deleteByExample(WriterExample example);

    int deleteByPrimaryKey(Integer writerId);

    int insert(Writer record);

    int insertSelective(Writer record);

    List<Writer> selectByExample(WriterExample example);

    Writer selectByPrimaryKey(Integer writerId);

    int updateByExampleSelective(@Param("record") Writer record, @Param("example") WriterExample example);

    int updateByExample(@Param("record") Writer record, @Param("example") WriterExample example);

    int updateByPrimaryKeySelective(Writer record);

    int updateByPrimaryKey(Writer record);
}