package jmu.hw.service;

import java.util.List;

import jmu.hw.po.FineDetail;
import jmu.hw.po.FineDetailExample;
import jmu.hw.po.FineDetailKey;

public interface FineDetailService {

    int deleteByExample(FineDetailExample example);

    int deleteByPrimaryKey(FineDetailKey key);

    int insert(FineDetail record);

    int insertSelective(FineDetail record);

    List<FineDetail> selectByExample(FineDetailExample example);

    FineDetail selectByPrimaryKey(FineDetailKey key);
    
    int updateByPrimaryKeySelective(FineDetail record);

    int updateByPrimaryKey(FineDetail record);
}
