package jmu.hw.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jmu.hw.dao.BorrowRequireMapper;
import jmu.hw.po.BorrowRequire;
import jmu.hw.po.BorrowRequireExample;
import jmu.hw.po.BorrowRequireKey;
import jmu.hw.service.BorrowRequireService;

@Service("borrowRequire")
public class BorrowRequireServiceImpl implements BorrowRequireService {
	
	@Autowired
	private BorrowRequireMapper borrowRequireMapper;

	@Override
	public List<BorrowRequire> selectByExample(BorrowRequireExample example) {

		return borrowRequireMapper.selectByExample(example);
	}

	@Override
	public BorrowRequire selectByPrimaryKey(BorrowRequireKey key) {
	
		return borrowRequireMapper.selectByPrimaryKey(key);
	}

}
