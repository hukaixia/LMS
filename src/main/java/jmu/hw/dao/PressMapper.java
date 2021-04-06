package jmu.hw.dao;

import java.util.List;
import jmu.hw.po.Press;
import jmu.hw.po.PressExample;
import org.apache.ibatis.annotations.Param;

public interface PressMapper {
    long countByExample(PressExample example);

    int deleteByExample(PressExample example);

    int deleteByPrimaryKey(String pressId);

    int insert(Press record);

    int insertSelective(Press record);

    List<Press> selectByExample(PressExample example);

    Press selectByPrimaryKey(String pressId);
    
    Press  selectByPressId(String pressId);

    int updateByExampleSelective(@Param("record") Press record, @Param("example") PressExample example);

    int updateByExample(@Param("record") Press record, @Param("example") PressExample example);

    int updateByPrimaryKeySelective(Press record);

    int updateByPrimaryKey(Press record);
}