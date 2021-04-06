package jmu.hw.service;

import java.util.List;

import jmu.hw.po.Unit;
import jmu.hw.po.UnitExample;

public interface UnitService {
	

    List<Unit> selectByExample(UnitExample example);

    Unit selectByPrimaryKey(String unitId);

}
