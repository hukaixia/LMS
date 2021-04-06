package jmu.hw.controller;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import jmu.hw.po.Unit;
import jmu.hw.po.Borrow;
import jmu.hw.service.BorrowService;
import jmu.hw.service.UnitService;
import jmu.hw.util.ExcelUtil;
import jmu.hw.util.ResponseMessage;

@Controller
public class ExcelController {
	
	@Autowired
	private BorrowService borrowService;
	@Autowired
	private UnitService unitService;
	// 以excel的形式导出
	@RequestMapping("/derivedExcel")
	@ResponseBody
	public ResponseMessage derivedExcel( @RequestParam(value="searchContent")String readerId,
            @RequestParam(value="unitId")String unitId,@RequestParam(value="startDate")String startDate,
            @RequestParam(value="endDate")String endDate) {
		int pageNum = 0;
		int num = 20000;
		Unit u = new Unit();
		String unitName ="";
		if(unitId!=null&&unitId!=""){
			 u = unitService.selectByPrimaryKey(unitId);
				unitName = u.getUnitName();
		}
			
		//获取打印数据
		SimpleDateFormat myFormatter = new SimpleDateFormat("yyyy-MM-dd");  
		Date d =new Date();  
		String nowDate = myFormatter.format(d); 
		List<Borrow> bs = new ArrayList<Borrow>();
		if(endDate==""||endDate==null)
			endDate = nowDate;
		if(startDate== null ||startDate=="")
		{
			if(unitId!=""&&unitId!=null)
				bs = borrowService.selectByExampleWithUnitPart(unitId);
			else
				bs = borrowService.selectByExampleWithIdPart("%"+readerId+"%");
			
		}else{
			if(unitId!=""&&unitId!=null)
				bs = borrowService.selectByExampleWithUnitPartDate(unitId,startDate,endDate);
		    else
		    	bs = borrowService.selectByExampleWithIdPartDate("%"+readerId+"%",startDate,endDate);
		}

		int count = bs.size();
		Map<String, Object> modelList = new HashMap<>();

		int total = count / num + 1;
		List<String> header = new ArrayList<>();
		header.add("姓名");
		header.add("ID");
		header.add("书名");
		header.add("图书ID");
		header.add("借阅时间");
		header.add("到期时间");
		header.add("归还时间");
		header.add("续借状态");
		modelList.put("total", total);
		modelList.put("number", count);
		modelList.put("enterprises", bs);
		List<List<String>> body = new ArrayList<>();
		for (int i = 0; i < bs.size(); i++) {
			List<String> data = new ArrayList<>();
			data.add(bs.get(i).getReader().getUserName());
			data.add(bs.get(i).getReaderId());

			data.add(bs.get(i).getBook().getBookDesc().getBookName());
			data.add(""+bs.get(i).getBookId());
			data.add(bs.get(i).getBorrowDate());
			data.add(bs.get(i).getReturnDate());
			if(bs.get(i).getReturnReadate()==""||bs.get(i).getReturnReadate()==null)
			data.add("未归还");
			else
			data.add(bs.get(i).getReturnReadate());
			if(bs.get(i).getRenewState()==0)
			data.add("否");
			else
				data.add("是");	
			body.add(data);
		}
 
		String dateString ="借阅报表"+ readerId+" "+unitName+" " +myFormatter.format(d);
		try (OutputStream out = new FileOutputStream("D:/" + dateString + "LMS.xls") // 导出目的地
 
		) {
			ExcelUtil.generateExcel("sheetName", header, body, out);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return ResponseMessage.success();
	}
}
