package excel;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {
	static String projectPath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public static void main(String[] args) {
		getdata();
	}

	public static void getdata() {

		try {
			projectPath = System.getProperty("user.dir");
			workbook = new XSSFWorkbook(projectPath + "/Excel/data.xlsx");
			sheet = workbook.getSheet("Sheet1");
			String cellData = sheet.getRow(0).getCell(0).getStringCellValue();
			System.out.println(cellData);
		} catch (Exception exp) {
			exp.getMessage();
			exp.getCause();
			exp.printStackTrace();
		}
	}
}
