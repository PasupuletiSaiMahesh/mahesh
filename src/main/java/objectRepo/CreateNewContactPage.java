package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewContactPage 
{
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastNameTextField;
	
	@FindBy(xpath="//input[@name='title']")
	private WebElement titleTextField;
	
	@FindBy(xpath="//input[@name='department']")
	private WebElement departmentTextField;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement emailtextField;
	
	@FindBy(xpath="//input[@name='mobile']")
	private WebElement mobileTextField;
	
	@FindBy(xpath="//input[@name='mailingcity']")
	private WebElement mailingcitytextField;
	
	@FindBy(xpath="//input[@name='mailingstate']")
	private WebElement mailingstateTextField;
	
	@FindBy(xpath="//input[@name='mailingcountry']")
	private WebElement mailingcountryTextField;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement 	saveButton;
	
	public CreateNewContactPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	public WebElement getTitleTextField() {
		return titleTextField;
	}

	public WebElement getDepartmentTextField() {
		return departmentTextField;
	}

	public WebElement getEmailtextField() {
		return emailtextField;
	}

	public WebElement getMobileTextField() {
		return mobileTextField;
	}

	public WebElement getMailingcitytextField() {
		return mailingcitytextField;
	}

	public WebElement getMailingstateTextField() {
		return mailingstateTextField;
	}

	public WebElement getMailingcountryTextField() {
		return mailingcountryTextField;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
	 /**
	  * THis is a  business libary to create a new contact
	  * @param lName
	  * @param title
	  * @param department
	  */
	public void CreateNewContactPage(String lName,String title,String department)
	{
		getLastNameTextField().sendKeys(lName);
		getTitleTextField().sendKeys(title);
		getDepartmentTextField().sendKeys(department);
		getSaveButton().click();
	}
	
	/**
	 * THis is a  business libary to create a new contact
	 * @param lName
	 * @param email
	 * @param mobile
	 * @param mailingCity
	 */
	public void CreateNewContactPage(String lName,String email,String mobile,String mailingCity)
	{
		getLastNameTextField().sendKeys(lName);
		getEmailtextField().sendKeys(email);
		getMobileTextField().sendKeys(mobile);
		getMailingcitytextField().sendKeys(mailingCity);
		getSaveButton().click();
		
	}
	
	public void CreateNewContactPage(String lname,String email,
			String mobile,String mailingCity,String mailingstate,String mailingcountry)
	{
		getLastNameTextField().sendKeys(lname);
		getEmailtextField().sendKeys(email);
		getMobileTextField().sendKeys(mobile);
		getMailingcitytextField().sendKeys(mailingCity);
		getMailingstateTextField().sendKeys(mailingstate);
		getMailingcountryTextField().sendKeys(mailingcountry);
		getSaveButton().click();
	}
	
	 
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
