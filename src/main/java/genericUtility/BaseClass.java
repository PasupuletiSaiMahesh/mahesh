package genericUtility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import objectRepo.HomepPage;
import objectRepo.LoginPage;

public class BaseClass 
{
	public WebDriver driver;
	public static WebDriver sDriver;               //used only for listeners
	public SeleniumUtility sUtil=new SeleniumUtility();
	public PropertitesUtility pUtil=new PropertitesUtility();
	public ExcelUtility eUtil=new ExcelUtility();
	
	@BeforeSuite
	public void dbConnection()
	{
		System.out.println("DB connection Created");
	}
	@BeforeClass
	public void lanchBrowser() throws IOException
	{
		driver=new ChromeDriver();
		sDriver=driver;
		sUtil.maximizeWindow(driver);
		sUtil.implicitWait(driver, 15);
		String URL=pUtil.getDataFromPropertiesFile("url");
		sUtil.navigateToApplication(driver, URL);
		System.out.println("Application opened succesfully");
		
	}

	
	@BeforeMethod
	public void loginOperation() throws Exception
	{
		LoginPage lp=new LoginPage(driver);
		String UN=pUtil.getDataFromPropertiesFile("username");
		String PWD=pUtil.getDataFromPropertiesFile("password");
		lp.loginToApplication(UN, PWD);
		System.out.println("Login successful");
	}
	
	@AfterMethod
	public void signOutOperation()
	{
		HomepPage hp = new HomepPage(driver);
		hp.SignOutOperation(driver);
		System.out.println("Logout successfull");
	}
	@AfterClass
	public void CloseBrowser()
	{
		driver.quit();
		System.out.println("Browser closed successfully");
	}
	
	@AfterSuite
	public void closeDBConnection()
	{
		System.out.println("DB connection closed");
	}
	
}
