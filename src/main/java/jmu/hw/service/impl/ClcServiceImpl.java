package jmu.hw.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jmu.hw.dao.ClcMapper;
import jmu.hw.po.Clc;
import jmu.hw.po.ClcExample;
import jmu.hw.service.ClcService;
@Service("clcService")
public class ClcServiceImpl implements ClcService {

	@Autowired
	private ClcMapper clcMapper;
	
	@Override
	public List<Clc> selectByExample(ClcExample example) {
		
		return clcMapper.selectByExample(example);
	}

	@Override
	public Clc selectByPrimaryKey(String clcId) {
	
		return clcMapper.selectByPrimaryKey(clcId);
	}

	@Override
	public List<Clc> selectByPart() {
		// TODO Auto-generated method stub
		return clcMapper.selectByPart();
	}

	@Override
	public List<Clc> selectByClcId() {
		// TODO Auto-generated method stub
		return clcMapper.selectByClcId();
	}

	@Override
	public List<Clc> selectByClcIdNot() {
		
		return clcMapper.selectByClcIdNot();
	}
    


}
