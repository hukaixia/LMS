package jmu.hw.dao;

import java.util.List;
import jmu.hw.po.Clc;
import jmu.hw.po.ClcExample;
import org.apache.ibatis.annotations.Param;

public interface ClcMapper {
	
    long countByExample(ClcExample example);

    int deleteByExample(ClcExample example);

    int deleteByPrimaryKey(String clcId);

    int insert(Clc record);

    int insertSelective(Clc record);

    List<Clc> selectByExample(ClcExample example);
    
    List<Clc> selectByPart();
   
    List<Clc>  selectByClcId();
    
    List<Clc>  selectByClcIdNot();
    
    Clc selectByPrimaryKey(String clcId);

    int updateByExampleSelective(@Param("record") Clc record, @Param("example") ClcExample example);

    int updateByExample(@Param("record") Clc record, @Param("example") ClcExample example);

    int updateByPrimaryKeySelective(Clc record);

    int updateByPrimaryKey(Clc record);
}