package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomepPage 
{
	@FindBy(xpath="//a[text()='Leads'  and @ href='index.php?module=Leads&action=index']")
	private WebElement leadsMenu;
	
	@FindBy(xpath="//a[text()='Contacts'  and @href='index.php?module=Contacts&action=index']")
	private WebElement contactsIcon;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement accountIcon;
	
	@FindBy(xpath="//a[@href='index.php?module=Users&action=Logout']")
	private WebElement SignoutIcon;
	
	
	public  HomepPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getLeadsMenu() 
	{
		return leadsMenu;	
	}
	public WebElement getContactsmenu()
	{
		return contactsIcon;		
	}
	public WebElement getAccountIcon()
	{
		return accountIcon ;
	}
	public WebElement getSignOutOption()
	{
		return SignoutIcon;
	}
	
	public void ClickOnLeadsMenu()
	{
		getLeadsMenu().click();
	}
	public void clickOnContactsMenu()
	{
		getContactsmenu().click();
		
	}
	/**
	 * This is a
	 * @param driver
	 */
	public void SignOutOperation(WebDriver driver)
	{
		Actions act = new Actions(driver);
		act.moveToElement(getAccountIcon()).perform();
		getSignOutOption().click();
		
	}
	
}
