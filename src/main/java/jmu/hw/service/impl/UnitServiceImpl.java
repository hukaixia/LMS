package jmu.hw.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jmu.hw.dao.UnitMapper;
import jmu.hw.po.Unit;
import jmu.hw.po.UnitExample;
import jmu.hw.service.UnitService;

@Service("unitService")
public class UnitServiceImpl implements UnitService {

	@Autowired
	private UnitMapper unitMapper;
	@Override
	public List<Unit> selectByExample(UnitExample example) {
		// TODO Auto-generated method stub
		return unitMapper.selectByExample(example);
	}

	@Override
	public Unit selectByPrimaryKey(String unitId) {
		// TODO Auto-generated method stub
		return unitMapper.selectByPrimaryKey(unitId);
	}

}
