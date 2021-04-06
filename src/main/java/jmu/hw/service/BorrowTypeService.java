package jmu.hw.service;

import java.util.List;

import jmu.hw.po.BorrowType;
import jmu.hw.po.BorrowTypeExample;

public interface BorrowTypeService {
	 List<BorrowType> selectByExample(BorrowTypeExample example);
}
