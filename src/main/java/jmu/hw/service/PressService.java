package jmu.hw.service;

import java.util.List;

import jmu.hw.po.Press;
import jmu.hw.po.PressExample;

public interface PressService {
    List<Press> selectByExample(PressExample example);
    
    Press  selectByPressId(String pressId);
}
