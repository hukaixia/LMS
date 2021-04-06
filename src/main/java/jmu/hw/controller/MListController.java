package jmu.hw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jmu.hw.dao.ClcMapper;
import jmu.hw.po.BorrowType;
import jmu.hw.po.Branch;
import jmu.hw.po.Clc;
import jmu.hw.po.Press;
import jmu.hw.po.PressExample;
import jmu.hw.service.BorrowTypeService;
import jmu.hw.service.BranchService;
import jmu.hw.service.ClcService;
import jmu.hw.service.PressService;
import jmu.hw.util.ResponseMessage;

@Controller
public class MListController {
	
	@Autowired
	private PressService pressService;
	@Autowired
	private BranchService branchService;
	@Autowired
	private BorrowTypeService borrowTypeService;
	@Autowired
	private ClcService clcService;
	
	@ResponseBody
	@RequestMapping("/pressList")
	public ResponseMessage PressList(){
		List<Press> press = pressService.selectByExample(null);
		return ResponseMessage.success().addObject("mylist", press);
	}
	@ResponseBody
	@RequestMapping("/branchList")
	public ResponseMessage BranchList(){
		List<Branch> branch = branchService.selectByExample(null);
		return ResponseMessage.success().addObject("mylist", branch);
	}
	
	@ResponseBody
	@RequestMapping("/borrowTypeList")
	public ResponseMessage BorrowTypeList(){
		List<BorrowType> borrowType = borrowTypeService.selectByExample(null);
		return ResponseMessage.success().addObject("mylist", borrowType);
	}
	@ResponseBody
	@RequestMapping("/clcList")
	public ResponseMessage ClcList(){
		List<Clc> clc = clcService.selectByClcIdNot();
		return ResponseMessage.success().addObject("mylist", clc);
	}


}
