package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Platform;

public class ExcelUtility {
	static XSSFWorkbook wb;
	static XSSFSheet sh;
	static XSSFRow row;
	static XSSFCell cell;
	
	static String CurrentDir=System.getProperty("user.dir");
	static String filepathName;
	
	public static String ExcelData(int rval,String WorkBookName,String sheet) throws IOException{
		if(Platform.getCurrent().toString().contains("WIN")){
			 filepathName=CurrentDir+"\\src\\test\\resources\\excels\\"+WorkBookName;
		}
		FileInputStream file = new FileInputStream(filepathName);
		wb = new XSSFWorkbook(file);
		sh = wb.getSheet(sheet);
		row =sh.getRow(rval);
		String cellval = row.getCell(1).getStringCellValue();
		return cellval;
	}

}
