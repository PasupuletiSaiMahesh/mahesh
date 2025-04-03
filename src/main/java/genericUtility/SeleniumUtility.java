package genericUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

/**
 * This Utility class which contains components from Selenium library
 * 
 * 
 */

public class SeleniumUtility 
{
	/**
	 * This is a generic method to access a web application
	 * @param driver
	 * @param url
	 */
	public void navigateToApplication(WebDriver driver,String url)
	{
		driver.get(url);
	}
	
	/**
	 * This is a generic method to maximize the browser
	 * @param driver
	 */
	public void maximizeWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	 /**
	  * This is a generic method to provide the implicit wait
	  * @param driver
	  * @param maxTime
	  */
	public void implicitWait(WebDriver driver ,int maxTime) 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(maxTime));
	}
	
	
	/////////Mouse Action////////////////
	
	/**
	 * this is a generic method Scroll the Webpage to a webelement
	 * @param driver
	 * @param element
	 */
	public void scrollingOperation(WebDriver driver ,WebElement element)
	{
		Actions act = new Actions(driver);
		act.scrollToElement(element).perform();
	}
	
	/**
	 * This is a generic method to perfrom mouse hovering action on a WebElement  
	 * @param driver
	 * @param element
	 */
	public void mouseHoveringAction(WebDriver driver,WebElement element)
	{
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}
	
	
	/**
	 * This is a generic method to perfrom doubleClick operation on a WebElement
	 * @param driver
	 * @param element
	 */
	public void doubleClickOperation(WebDriver driver,WebElement element) 
	{
		Actions act = new Actions(driver);
		act.doubleClick(element).perform();	
	}
	

	
	////////////////Handling Alert//////////////
	
	/**
	 * This is a generic method to accept alert popup
	 * @param driver
	 */
	public void acceptAlert(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	
	/**
	 * This is a generic method to cancel alert popup 
	 * @param driver
	 */
	public void dismmAlert(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	
	/**
	 * This is a generic method to get alert popup
	 * @param driver
	 */
	public String getAlert(WebDriver driver)
	{
		String message=driver.switchTo().alert().getText();
		return message;
	}
	
	
	/**
	 * This is a generic method to send value to alert popup
	 * @param driver
	 * @param value
	 */
	public void sendValueAlert(WebDriver driver,String value)
	{
		driver.switchTo().alert().sendKeys(value);
	}
	
	////////////////Handling Dropdown////////////////
	
	/**
	 * This is a generic method to select an option in dropdown using its index
	 * @param element
	 * @param index
	 */
	public void SelectOptionByIndex(WebElement element ,int index)
	{
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}
	
	
	/**
	 * This is a generic method to select an option in dropdown using its value attribute
	 * @param element
	 * @param value
	 */
	public void SelectOptionByvalue(WebElement element ,String value)
	{
		Select sel = new Select(element);
		sel.selectByValue(value);
	}
	
	
	/**
	 * This is a generic method to select an option in dropdown using its Visibletext
	 * @param element
	 * @param Visibletext
	 */
	public void SelectOptionByVisisbleText(WebElement element ,String Visibletext)
	{
		Select sel = new Select(element);
		sel.selectByValue(Visibletext);
	}
	
	///////////////////Taking Screenshot///////////////
	
	/**
	 * This is a generic method to take the Screenshot of the Webpage
	 * @param driver
	 * @param dateTimeStamp
	 * @return
	 * @throws IOException
	 */
	public String TakingScreenShot(WebDriver driver,String dateTimeStamp) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(".\\Screenshots\\image - "+dateTimeStamp+".png");
		Files.copy(src, dest);
		return dest.getAbsolutePath();    //for Listeners
		
	}
	
	
	
	
	
	
	
	
}
