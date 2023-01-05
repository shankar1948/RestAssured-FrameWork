package com.RestAssured.GenericUtilities;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class ExcelUtility {

	public Object[][] readDataFromDataProvider(String SheetName) throws Throwable {
		FileInputStream fi=new FileInputStream("./src/test/resources/Book1.xlsx");
		Workbook wb=WorkbookFactory.create(fi);
		Sheet sh=wb.getSheet(SheetName);
		int lastRow=sh.getLastRowNum()+1;
		int lastCell = sh.getRow(0).getLastCellNum();
		Object[][] obj = new Object[lastRow][lastCell];
		for (int i = 0; i <lastRow; i++) {
			for (int j = 0; j < lastCell; j++) {
				obj[i][j]=sh.getRow(i).getCell(j).getStringCellValue();
			}
			
		}
		return obj;
	}
}
