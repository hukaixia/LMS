package jmu.hw.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jmu.hw.dao.BranchMapper;
import jmu.hw.po.Branch;
import jmu.hw.po.BranchExample;
import jmu.hw.service.BranchService;

@Service("branchService")
public class BranchServiceImpl implements BranchService {

	@Autowired
	private BranchMapper branchMapper;
	@Override
	public List<Branch> selectByExample(BranchExample example) {
		return branchMapper.selectByExample(null);
	}

}
