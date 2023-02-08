package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFCell cell;
	public static String locatorColumnValue;
	public static String locatorName;
	public static String locatorValue;
	public static String keywordColumnValue;
	public static String dataColumnvalue;
	public static int totalRows;

	public void readExcelFile(String location) throws IOException {

		FileInputStream fis = new FileInputStream(location);

		workbook = new XSSFWorkbook(fis);

		sheet = workbook.getSheetAt(0);
		
		totalRows = sheet.getLastRowNum();

	}

	public void getLocatorsKeywordsAndData(int row, int locatorColumn, int keywordColumn, int dataColumn) {

//		cell = sheet.getRow(row).getCell(column);
//
//		String cellValue = cell.getStringCellValue();

//		System.out.println(cellValue);

		locatorColumnValue = sheet.getRow(row).getCell(locatorColumn).toString().trim();
		if (!locatorColumnValue.contains("NA") && locatorColumnValue.split("=").length > 1) {
			locatorName = locatorColumnValue.split("=")[0].toString().trim();
			locatorValue = locatorColumnValue.split("=")[1].toString().trim();
		} else {
			locatorName = "NA";
			locatorValue = "NA";
		}

		

//		if (!locatorColumnValue.contains("NA")) {
//			locatorName = locatorColumnValue.split("=")[0].toString().trim();
//			locatorValue = locatorColumnValue.split("=")[1].toString().trim();
//		} else {
//			locatorName = "NA";
//			locatorValue = "NA";
//		}
        //keywordColumnValue = sheet.getRow(row).getCell(keywordColumn).toString().trim();
		keywordColumnValue = sheet.getRow(row).getCell(keywordColumn).toString().trim();
        dataColumnvalue = sheet.getRow(row).getCell(dataColumn).toString().trim();
        
		 System.out.println(locatorName +" : "+ locatorValue+ " keyword : "+keywordColumnValue + "Data : "+dataColumnvalue);
	}
	
}
