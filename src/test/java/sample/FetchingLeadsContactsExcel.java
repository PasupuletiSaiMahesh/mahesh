package sample;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import genericUtility.ExcelUtility;
 

public class FetchingLeadsContactsExcel 
{ 
	public static void main(String[] args) throws Exception 
	{
		FileInputStream fis =new FileInputStream("C:\\TestData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Leads");
		Row r=sh.getRow(2);
		Cell c=r.getCell(3);
		DataFormatter df=new DataFormatter();
		String value=df.formatCellValue(c);
		System.out.println(value);
		
		ExcelUtility elt = new ExcelUtility();
		String val=elt.getDataFromExcelFile("Leads", 2, 3);
		String val1=elt.getDataFromExcelFile("Leads", 2, 2);
		String val2=elt.getDataFromExcelFile("Contacts", 7, 2);
		System.out.println(val);
		System.out.println(val1);
		System.out.println(val2);

		
	}

}
