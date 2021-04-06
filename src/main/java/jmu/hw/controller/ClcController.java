package jmu.hw.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import jmu.hw.po.Clc;
import jmu.hw.po.ClcExample;
import jmu.hw.po.Reader;
import jmu.hw.service.ClcService;
import jmu.hw.util.ResponseMessage;

@Controller
public class ClcController {

	@Autowired
	private ClcService clcService;

	@ResponseBody
	@RequestMapping("/clcIdList")
	public ResponseMessage AddReader() {
		List<Clc> clc = clcService.selectByClcId();
		return ResponseMessage.success().addObject("mylist",clc);
	}
	
	@ResponseBody
	@RequestMapping("/clcUpIdList")
	public ResponseMessage ClcUpIdList(@RequestParam(value="clcId")String clcId) {
		ClcExample ce = new ClcExample();
		ce.createCriteria().andClcUpIdEqualTo(clcId).andClcIdNotEqualTo(clcId);
		List<Clc> clc = clcService.selectByExample(ce);
		return ResponseMessage.success().addObject("mylist",clc);
	}
	

	@RequestMapping("/testForm")
	public ResponseMessage testForm(@RequestParam(value="list")String []clcId) {
		for(int i=0;i<clcId.length;i++)
			System.err.println(clcId[i]);
		return ResponseMessage.success();
	}
}
