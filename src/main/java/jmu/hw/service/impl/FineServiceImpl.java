package jmu.hw.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jmu.hw.dao.FineMapper;
import jmu.hw.po.Fine;
import jmu.hw.po.FineExample;
import jmu.hw.service.FineService;

@Service("fineService")
public class FineServiceImpl implements FineService {

	@Autowired
	private FineMapper fineMapper;
	
	@Override
	public int deleteByExample(FineExample example) {
	
		return fineMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer fineId) {
	
		return fineMapper.deleteByPrimaryKey(fineId);
	}

	@Override
	public int insert(Fine record) {
	
		return fineMapper.insert(record);
	}

	@Override
	public int insertSelective(Fine record) {
		
		return fineMapper.insertSelective(record);
	}

	@Override
	public List<Fine> selectByExample(FineExample example) {
	
		return  fineMapper.selectByExample(example);
	}

	@Override
	public Fine selectByPrimaryKey(Integer fineId) {
		
		return fineMapper.selectByPrimaryKey(fineId);
	}

	@Override
	public List<Fine> selectByExampleWithAll(FineExample example) {
	
		return fineMapper.selectByExampleWithAll(example);
	}

	@Override
	public int updateByExample(Fine record, FineExample example) {
		
		return fineMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKey(Fine record) {
		
		return fineMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<Fine> selectByExampleByReaderIdPart(String readerId) {
	
		return fineMapper.selectByExampleByReaderIdPart(readerId);
	}

	@Override
	public List<Fine> selectByExampleByUserNamePart(String userName) {
		
		return fineMapper.selectByExampleByUserNamePart(userName);
	}

	@Override
	public List<Fine> selectByExampleByBookNamePart(String bookName) {
		
		return fineMapper.selectByExampleByBookNamePart(bookName);
	}

	@Override
	public List<Fine> selectByExampleByBookId(Integer bookId) {
		
		return fineMapper.selectByExampleByBookId(bookId);
	}

}
