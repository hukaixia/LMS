package jmu.hw.service;

import java.util.List;

import jmu.hw.po.BorrowRequire;
import jmu.hw.po.BorrowRequireExample;
import jmu.hw.po.BorrowRequireKey;

public interface BorrowRequireService {
	
	   List<BorrowRequire> selectByExample(BorrowRequireExample example);

	    BorrowRequire selectByPrimaryKey(BorrowRequireKey key);

}
