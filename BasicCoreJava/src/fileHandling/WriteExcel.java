package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream(
				"H:\\Automation\\NewAutomationRepo\\BasicCoreJava\\src\\fileHandling\\TestData.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		XSSFRow row = sheet.getRow(3);
		if (row==null) {
			row=sheet.createRow(0);
		}
		XSSFCell cell = row.getCell(0);
		if (cell==null) {
			cell=row.createCell(0);
		}
		
		
		cell.setCellValue("shashank");
		FileOutputStream file2 = new FileOutputStream(
				"H:\\Automation\\NewAutomationRepo\\BasicCoreJava\\src\\fileHandling\\TestData.xlsx");
		wb.write(file2);

	}

}
