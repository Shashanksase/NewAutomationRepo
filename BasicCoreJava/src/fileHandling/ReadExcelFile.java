package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {

	public static void main(String[] args) throws IOException {

		FileInputStream file = new FileInputStream(
				"H:\\Automation\\NewAutomationRepo\\BasicCoreJava\\src\\fileHandling\\TestData.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		/*
		 * XSSFRow row = sheet.getRow(0); XSSFCell cell = row.getCell(0); String data =
		 * cell.getStringCellValue(); System.out.println(data);
		 */
		/*sss*/
		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(0).getLastCellNum();
		/*
		 * System.out.println(rows); System.out.println(cols);
		 */
		for (int r = 0; r <= rows; r++) {

			for (int c = 0; c < cols; c++) {
				System.out.print(sheet.getRow(r).getCell(c).getStringCellValue() + "  ");
			}
			System.out.println();
		}

	}

}
