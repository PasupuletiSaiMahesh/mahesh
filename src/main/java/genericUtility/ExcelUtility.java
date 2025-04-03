package genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility 
{
	/** 
	 * This is a generic method to fetch a single cell
	 * @param sheetName
	 * @param rowIndex
	 * @param cellIndex
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	
	public String getDataFromExcelFile(String sheetName ,int rowIndex,int cellIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new  FileInputStream(IpathUtility.Excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row r = sh.getRow(rowIndex);
		Cell c = r.getCell(cellIndex);
		DataFormatter df = new DataFormatter();
		String value = df.formatCellValue(c);
		return value;
	}
	 
	/**
	 * The Generic method getMultipleDatafromExcel
	 * @param Sheetname
	 * @param StartRowIndex
	 * @param startcellIndex
	 * @return
	 * @throws Exception
	 */
	public List<String> getMultipleDatafromExcel(String Sheetname,int StartRowIndex,int startcellIndex) throws Exception
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\mahir\\OneDrive\\Desktop\\AnimAll.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(Sheetname);
		DataFormatter df=new DataFormatter();
		List<String> a1=new ArrayList<String>();
		for(int i=StartRowIndex;i<=sh.getLastRowNum();i++)
		{
			Row r = sh.getRow(i);
			for(int j=startcellIndex;j<r.getLastCellNum();j++)
			{
				Cell c= r.getCell(j);
				String value = df.formatCellValue(c);
				System.out.println(value);
				
			}
		}
		return a1;
	}
	/**
	 * This is a generic method WriteDataToExcelFile
	 * @param Sheetname
	 * @param rowIndex
	 * @param cellIndex
	 * @param value
	 * @throws Exception
	 * @throws IOException
	 */
	public void WriteDataToExcelFile(String Sheetname,int rowIndex,int cellIndex,String value) throws Exception, IOException 
	{
		FileInputStream fis = new FileInputStream(IpathUtility.Excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(Sheetname);
		Row r=sh.createRow(rowIndex);
		Cell c=r.createCell(cellIndex);
		c.setCellValue(value);
		FileOutputStream fos = new FileOutputStream(IpathUtility.Excelpath);
		wb.write(fos);
	}
	
	
	
	
	

}
