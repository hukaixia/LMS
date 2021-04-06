package jmu.hw.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jmu.hw.dao.ReaderTypeMapper;
import jmu.hw.po.ReaderType;
import jmu.hw.po.ReaderTypeExample;
import jmu.hw.service.ReaderTypeService;

@Service("readerTypeService")
public class ReaderTypeServiceImpl implements ReaderTypeService {

	@Autowired
	private ReaderTypeMapper readerTypeMapper;
	
	@Override
	public List<ReaderType> selectByExample(ReaderTypeExample example) {
		// TODO Auto-generated method stub
		return readerTypeMapper.selectByExample(null);
	}

	@Override
	public ReaderType selectByPrimaryKey(String readerTypeId) {
		// TODO Auto-generated method stub
		return readerTypeMapper.selectByPrimaryKey(readerTypeId);
	}

}
