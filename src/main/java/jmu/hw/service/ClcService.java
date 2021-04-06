package jmu.hw.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import jmu.hw.po.Clc;
import jmu.hw.po.ClcExample;

public interface ClcService {


    List<Clc> selectByExample(ClcExample example);

    Clc selectByPrimaryKey(String clcId);
    
    List<Clc> selectByPart();
    
    List<Clc>  selectByClcId();
    
    List<Clc>  selectByClcIdNot();

}
