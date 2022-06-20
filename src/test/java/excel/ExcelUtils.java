package excel;

public class ExcelUtils {
	
	//Created new class for utils to write code for excelpath and sheetname
	public static void main(String[] args) {
		String projectPath = System.getProperty("user.dir");
		ExcelData excel = new ExcelData(projectPath+"/Excel/data.xlsx", "Sheet1");
		excel.getdata(0, 0);
	}

}
