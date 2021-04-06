package jmu.hw.service;

import java.util.List;

import jmu.hw.po.Branch;
import jmu.hw.po.BranchExample;

public interface BranchService {
	List<Branch> selectByExample(BranchExample example);
}
