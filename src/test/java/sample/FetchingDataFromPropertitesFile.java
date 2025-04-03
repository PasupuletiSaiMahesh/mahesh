package sample;

import java.io.IOException;

import genericUtility.JavaUtility;

public class FetchingDataFromPropertitesFile
{
	public static void main(String[] args) throws IOException 
	{
//		WebDriver driver=new ChromeDriver();
//		
//
//		PropertitesUtility pUtil = new PropertitesUtility();
//		String URL = pUtil.getDataFromPropertiesFile("url");
//		driver.get(URL);

	
	
	JavaUtility jutil=new JavaUtility();
	int value= jutil.generateRandomNumber(1000);
	System.out.println(value);
	
	String dateStamp= jutil.getCalenderDetails("dd-MM-YYYY");
	System.out.println(dateStamp);
	
	String dateTimeStamp= jutil.getCalenderDetails("dd-MMM-YYYY hh-mm-ss");
	System.out.println(dateTimeStamp);
	}

}
