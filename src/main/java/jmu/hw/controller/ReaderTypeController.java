package jmu.hw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jmu.hw.po.Branch;
import jmu.hw.po.ReaderType;
import jmu.hw.service.ReaderTypeService;
import jmu.hw.util.ResponseMessage;

@Controller
public class ReaderTypeController {
	
	@Autowired
	private ReaderTypeService readerTypeService;
	
	@ResponseBody
	@RequestMapping("getReaderTypeList")
	public ResponseMessage GetReaderType(){
		List<ReaderType> readerType = readerTypeService.selectByExample(null);
		return ResponseMessage.success().addObject("mylist", readerType);
	}

}
