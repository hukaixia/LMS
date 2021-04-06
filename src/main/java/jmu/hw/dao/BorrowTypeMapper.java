package jmu.hw.dao;

import java.util.List;
import jmu.hw.po.BorrowType;
import jmu.hw.po.BorrowTypeExample;
import org.apache.ibatis.annotations.Param;

public interface BorrowTypeMapper {
    long countByExample(BorrowTypeExample example);

    int deleteByExample(BorrowTypeExample example);

    int deleteByPrimaryKey(String borrowTypeId);

    int insert(BorrowType record);

    int insertSelective(BorrowType record);

    List<BorrowType> selectByExample(BorrowTypeExample example);

    BorrowType selectByPrimaryKey(String borrowTypeId);

    int updateByExampleSelective(@Param("record") BorrowType record, @Param("example") BorrowTypeExample example);

    int updateByExample(@Param("record") BorrowType record, @Param("example") BorrowTypeExample example);

    int updateByPrimaryKeySelective(BorrowType record);

    int updateByPrimaryKey(BorrowType record);
}