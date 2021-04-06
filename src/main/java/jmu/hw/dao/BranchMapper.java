package jmu.hw.dao;

import java.util.List;
import jmu.hw.po.Branch;
import jmu.hw.po.BranchExample;
import org.apache.ibatis.annotations.Param;

public interface BranchMapper {
    long countByExample(BranchExample example);

    int deleteByExample(BranchExample example);

    int deleteByPrimaryKey(String branchId);

    int insert(Branch record);

    int insertSelective(Branch record);

    List<Branch> selectByExample(BranchExample example);

    Branch selectByPrimaryKey(String branchId);

    int updateByExampleSelective(@Param("record") Branch record, @Param("example") BranchExample example);

    int updateByExample(@Param("record") Branch record, @Param("example") BranchExample example);

    int updateByPrimaryKeySelective(Branch record);

    int updateByPrimaryKey(Branch record);
}