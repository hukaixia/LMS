package jmu.hw.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jmu.hw.dao.BorrowTypeMapper;
import jmu.hw.po.BorrowType;
import jmu.hw.po.BorrowTypeExample;
import jmu.hw.service.BorrowTypeService;

@Service("borrowTypeService")
public class BorrowTypeServiceImpl implements BorrowTypeService {

	@Autowired
	private BorrowTypeMapper borrowTypeMapper;
	@Override
	public List<BorrowType> selectByExample(BorrowTypeExample example) {
		
		return borrowTypeMapper.selectByExample(null);
	}

}
