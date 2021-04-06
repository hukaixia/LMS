package jmu.hw.util;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ExcelUtil {

	public static void generateExcel(String sheetName, List<String> header, List<List<String>> body, OutputStream out) {
		// 新建excel报表
		Workbook excel = new HSSFWorkbook();
		// 添加一个sheet
		Sheet hssfSheet = excel.createSheet(sheetName);
		// 往excel表格创建一行，excel的行号是从0开始的
		// 设置表头
		Row firstRow = hssfSheet.createRow(0);
		for (int columnNum = 0; columnNum < header.size(); columnNum++) {
			// 创建单元格
			Cell hssfCell = firstRow.createCell(columnNum);
			// 设置单元格的值
			hssfCell.setCellValue(header.size() < columnNum ? "-" : header.get(columnNum));
		}
		// 手动设置列宽。第一个参数表示要为第几列设；，第二个参数表示列的宽度，n为列高的像素数。
		for (int i = 0; i < body.size() + 7; i++) {
			hssfSheet.setColumnWidth((short) i, (short) (28 * 200));
		}
 
		// 设置主体数据
		for (int rowNum = 0; rowNum < body.size(); rowNum++) {
			// 往excel表格创建一行，excel的行号是从0开始的
			Row hssfRow = hssfSheet.createRow(rowNum + 1);
			List<String> data = body.get(rowNum);
			for (int columnNum = 0; columnNum < data.size(); columnNum++) {
				// 创建单元格
				Cell hssfCell = hssfRow.createCell(columnNum);
				// 设置单元格的值
				hssfCell.setCellValue(data.size() < columnNum ? "-" : data.get(columnNum));
			}
		}
		try {
			excel.write(out);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
