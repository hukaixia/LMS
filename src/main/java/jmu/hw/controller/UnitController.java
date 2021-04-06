package jmu.hw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jmu.hw.po.ReaderType;
import jmu.hw.po.Unit;
import jmu.hw.service.UnitService;
import jmu.hw.util.ResponseMessage;

@Controller
public class UnitController {
	
	@Autowired
	private UnitService unitService;
	
	@ResponseBody
	@RequestMapping("getUnitList")
	public ResponseMessage UnitList(){
		List<Unit> unit = unitService.selectByExample(null);
		return ResponseMessage.success().addObject("mylist",unit);
	}


}
