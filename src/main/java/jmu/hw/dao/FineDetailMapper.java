package jmu.hw.dao;

import java.util.List;
import jmu.hw.po.FineDetail;
import jmu.hw.po.FineDetailExample;
import jmu.hw.po.FineDetailKey;
import org.apache.ibatis.annotations.Param;

public interface FineDetailMapper {
    long countByExample(FineDetailExample example);

    int deleteByExample(FineDetailExample example);

    int deleteByPrimaryKey(FineDetailKey key);

    int insert(FineDetail record);

    int insertSelective(FineDetail record);

    List<FineDetail> selectByExample(FineDetailExample example);

    FineDetail selectByPrimaryKey(FineDetailKey key);

    int updateByExampleSelective(@Param("record") FineDetail record, @Param("example") FineDetailExample example);

    int updateByExample(@Param("record") FineDetail record, @Param("example") FineDetailExample example);

    int updateByPrimaryKeySelective(FineDetail record);

    int updateByPrimaryKey(FineDetail record);
}