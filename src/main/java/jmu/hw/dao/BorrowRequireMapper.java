package jmu.hw.dao;

import java.util.List;
import jmu.hw.po.BorrowRequire;
import jmu.hw.po.BorrowRequireExample;
import jmu.hw.po.BorrowRequireKey;
import org.apache.ibatis.annotations.Param;

public interface BorrowRequireMapper {
    long countByExample(BorrowRequireExample example);

    int deleteByExample(BorrowRequireExample example);

    int deleteByPrimaryKey(BorrowRequireKey key);

    int insert(BorrowRequire record);

    int insertSelective(BorrowRequire record);

    List<BorrowRequire> selectByExample(BorrowRequireExample example);

    BorrowRequire selectByPrimaryKey(BorrowRequireKey key);

    int updateByExampleSelective(@Param("record") BorrowRequire record, @Param("example") BorrowRequireExample example);

    int updateByExample(@Param("record") BorrowRequire record, @Param("example") BorrowRequireExample example);

    int updateByPrimaryKeySelective(BorrowRequire record);

    int updateByPrimaryKey(BorrowRequire record);
}