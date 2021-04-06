package jmu.hw.service;

import java.util.List;

import jmu.hw.po.Reader;
import jmu.hw.po.ReaderExample;

public interface ReaderService {
	int deleteByPrimaryKey(String readerId);

    int insert(Reader record);
    
    int updateByPrimaryKeySelective(Reader record);
    
    List<Reader> selectByExample(ReaderExample example);
    
    List<Reader> selectByExampleByAll(ReaderExample example);
    
    List<Reader>  selectByExampleByUnitPart(String unitName);
    
    Reader selectByPrimaryKey(String readerId);
}