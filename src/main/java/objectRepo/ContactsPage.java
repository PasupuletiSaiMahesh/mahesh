package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This is a contacts page POM class
 * @author mahiroyal
 * @version 
 * 
 */
public class ContactsPage 
{
	@FindBy(xpath="//img[@title='Create Contact...']")
	private WebElement CreateNewContactsIcon;
	
	public ContactsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getCreateNewContactsIcon()
	{
		return CreateNewContactsIcon;
	}
	/**
	 * This is a business Library on Create new contacts icon
	 */
	public void ClickOnCreateNewContactsIcon() 
	{
		getCreateNewContactsIcon().click();		
	}

}
