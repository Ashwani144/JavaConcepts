package Java_Basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadData {

	public static void main(String[] args) throws Exception {

		//path of file excel data
		FileInputStream fis=new FileInputStream("C:\\Users\\HP\\Downloads\\dataforexcelRead.xlsx");
		//creating new wrok
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		
		
		System.out.println(sheet.getRow(0).getCell(0));
	}

}
