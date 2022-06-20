package excel;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {
	static String projectPath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	// Constructor to get path n sheetname frome ExcelUtils class
	public ExcelData(String excelPath, String sheetName) {
		try {

			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);
		} catch (Exception exp) {
			exp.getMessage();
			exp.getCause();
			exp.printStackTrace();
		}

	}

//	public static void main(String[] args) {
//		getdata(0, 0);
//	}
	
	//Using parameters to avoid hardcoding
	public static void getdata(int rowNum, int colNum) {

		try {
			//Hard coded
			//sheet.getRow(0).getCell(0).getStringCellValue();
			String cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			System.out.println(cellData);
		} catch (Exception exp) {
			exp.getMessage();
			exp.getCause();
			exp.printStackTrace();
		}
	}
}
