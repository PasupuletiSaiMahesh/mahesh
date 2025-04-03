package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtility.SeleniumUtility;

public class PamClassDemoApp 
{
	public static void main(String[] args) throws InterruptedException 
	{
		SeleniumUtility sutil= new SeleniumUtility();
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		sutil.navigateToApplication(driver, "https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		sutil.maximizeWindow(driver);
		Thread.sleep(2000);
		sutil.implicitWait(driver, 10);
		Thread.sleep(2000);
		WebElement element=driver.findElement(By.id("name"));
		element.sendKeys("Mahesh");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		element.sendKeys("Mahesh");
				
		
	}

}
