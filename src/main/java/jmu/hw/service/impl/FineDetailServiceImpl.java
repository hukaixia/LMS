package jmu.hw.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jmu.hw.dao.FineDetailMapper;
import jmu.hw.po.FineDetail;
import jmu.hw.po.FineDetailExample;
import jmu.hw.po.FineDetailKey;
import jmu.hw.service.FineDetailService;

@Service("fineDetailService")
public class FineDetailServiceImpl implements FineDetailService {

	@Autowired
	private FineDetailMapper fineDetailMapper;
	@Override
	public int deleteByExample(FineDetailExample example) {
		 
		return fineDetailMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(FineDetailKey key) {
		
		return fineDetailMapper.deleteByPrimaryKey(key);
	}

	@Override
	public int insert(FineDetail record) {
		
		return fineDetailMapper.insert(record);
	}

	@Override
	public int insertSelective(FineDetail record) {
	
		return fineDetailMapper.insertSelective(record);
	}

	@Override
	public List<FineDetail> selectByExample(FineDetailExample example) {
	
		return  fineDetailMapper.selectByExample(example);
	}

	@Override
	public FineDetail selectByPrimaryKey(FineDetailKey key) {
		
		return fineDetailMapper.selectByPrimaryKey(key);
	}

	@Override
	public int updateByPrimaryKeySelective(FineDetail record) {
		
		return fineDetailMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(FineDetail record) {
	
		return fineDetailMapper.updateByPrimaryKey(record);
	}

}
