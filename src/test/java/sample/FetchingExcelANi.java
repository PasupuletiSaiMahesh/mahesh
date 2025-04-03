package sample;

import genericUtility.ExcelUtility;

public class FetchingExcelANi 
{
	public static void main(String[] args) throws Exception 
	{
//		FileInputStream fis =new FileInputStream("C:\\AniEx.xlsx");
//		Workbook wb=WorkbookFactory.create(fis);
//		Sheet sh=wb.getSheet("animal");
//		Row r=sh.getRow(3);
//		Cell c=r.getCell(3);
//		DataFormatter df=new DataFormatter();
//		String value=df.formatCellValue(c);
//		System.out.println(value);
		
		ExcelUtility ety = new ExcelUtility();
		String val=ety.getDataFromExcelFile("animal", 3, 3);
		String val1=ety.getDataFromExcelFile("animal", 1, 0);
		String val2=ety.getDataFromExcelFile("bird", 5, 4);
		System.out.println(val);
		System.out.println(val1);
		System.out.println(val2);
		
	}

}
