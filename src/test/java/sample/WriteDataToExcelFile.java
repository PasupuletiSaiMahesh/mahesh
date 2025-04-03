package sample;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import genericUtility.ExcelUtility;

public class WriteDataToExcelFile 
{
	public static void main(String[] args) throws Exception 
	{
		FileInputStream fis = new FileInputStream("D:\\AnimAll.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Animlas2");
		Row r=sh.getRow(4);
		Cell c=r.createCell(2);
		c.setCellValue("Tata");
		
//		Row r=sh.createRow(4);
//		Cell c=r.createCell(3);
//		c.setCellValue("Hi");
		FileOutputStream fos = new FileOutputStream("D:\\AnimAll.xlsx");
		wb.write(fos);
		
		
		
	
//		ExcelUtility elt = new ExcelUtility();
//		elt.WriteDataToExcelFile("Animals2", 6, 3, "Horse");
	  
		
		
	}
	
	
	
	

}
