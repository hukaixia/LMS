package jmu.hw.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jmu.hw.dao.PressMapper;
import jmu.hw.po.Press;
import jmu.hw.po.PressExample;
import jmu.hw.service.PressService;

@Service("pressService")
public class PressServiceIpl implements PressService {

	@Autowired
	private PressMapper pressMapper;
	@Override
	public List<Press> selectByExample(PressExample example) {
		// TODO Auto-generated method stub
		return pressMapper.selectByExample(null);
	}
	@Override
	public Press selectByPressId(String pressId) {
		
		return pressMapper.selectByPressId(pressId);
	}

}
