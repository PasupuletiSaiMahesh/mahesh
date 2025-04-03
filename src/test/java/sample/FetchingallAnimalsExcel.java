package sample;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import genericUtility.ExcelUtility;

public class FetchingallAnimalsExcel 
{
	public static void main(String[] args) throws Exception, IOException 
	{
//		FileInputStream fis = new FileInputStream("C:\\Users\\mahir\\OneDrive\\Desktop\\AnimAll.xlsx");
//		Workbook wb = WorkbookFactory.create(fis);
//		Sheet sh = wb.getSheet("Animlas2");
//		DataFormatter df=new DataFormatter();
//		for(int i=1;i<=sh.getLastRowNum();i++)
//		{
//			Row r = sh.getRow(i);
//			for(int j=1;j<r.getLastCellNum();j++)
//			{
//				Cell c= r.getCell(j);
//				String value = df.formatCellValue(c);
//				System.out.println(value);
//				
//			}
//		}
		
		ExcelUtility elt = new ExcelUtility();
		List<String> value=elt.getMultipleDatafromExcel("Animlas2", 1, 1);
		System.out.println(value);
		
		
	}

}
