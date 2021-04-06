package jmu.hw.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jmu.hw.dao.ReaderMapper;
import jmu.hw.po.Reader;
import jmu.hw.po.ReaderExample;
import jmu.hw.service.ReaderService;

@Service("readerService")
public class ReaderServiceImpl implements ReaderService {

	@Autowired
	private ReaderMapper readerMapper;
	@Override
	public int deleteByPrimaryKey(String readerId) {
	
		return readerMapper.deleteByPrimaryKey(readerId);
	}

	@Override
	public int insert(Reader record) {
		return readerMapper.insert(record);
	}

	@Override
	public int updateByPrimaryKeySelective(Reader record) {
		
		return readerMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<Reader> selectByExample(ReaderExample example) {
		
		return readerMapper.selectByExample(example);
	}

	@Override
	public Reader selectByPrimaryKey(String readerId) {
		// TODO Auto-generated method stub
		return readerMapper.selectByPrimaryKey(readerId);
	}

	@Override
	public List<Reader> selectByExampleByAll(ReaderExample example) {
		// TODO Auto-generated method stub
		return readerMapper.selectByExampleByAll(example);
	}

	@Override
	public List<Reader> selectByExampleByUnitPart(String unitName) {
		// TODO Auto-generated method stub
		return readerMapper.selectByExampleByUnitPart(unitName);
	}

}
