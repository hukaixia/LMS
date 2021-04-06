package jmu.hw.service;

import java.util.List;

import jmu.hw.po.ReaderType;
import jmu.hw.po.ReaderTypeExample;

public interface ReaderTypeService {

    List<ReaderType> selectByExample(ReaderTypeExample example);

    ReaderType selectByPrimaryKey(String readerTypeId);
}
