package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreatingNewLeadPage 
{
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement FristnameTextField;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement LastNAmeTextField;
	
	@FindBy(xpath="//input[@name='company']")
	private WebElement CompanyTextFied;
	
	@FindBy(xpath="//input[@name='designation']")
	private WebElement TitleTextFeild;
	
	@FindBy(xpath="//select[@name='leadsource']")
	private WebElement LeadsourceDropDown;
	
	@FindBy(xpath="//input[@name='mobile']")
	private WebElement MobileTextFeild;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement emailTextFeild;
	
	@FindBy(xpath="//input[@name='noofemployees']")
	private WebElement noOfEmployeesTextFeild;
	
	@FindBy(xpath="//input[@id='city']")
	private WebElement cityTextFeild;
	
	@FindBy(xpath="//input[@id='country']")
	private WebElement countryTextFeild;
	
	@FindBy(xpath="//input[@id='state']")
	private WebElement statetextFeild;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	
	public CreatingNewLeadPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getFristnameTextField()
	{
		return FristnameTextField;
		
	}
	public WebElement getLastNAmeTextField()
	{
		return LastNAmeTextField;
		
	}
	
	public WebElement getCompanyTextFied() 
	{
		return CompanyTextFied;
	}
	public WebElement getTitletextFeild()
	{
		return TitleTextFeild;	
	}
	public WebElement getLeadsourceDropDown()
	{
		return LeadsourceDropDown;
		
	}
	public WebElement getMobileTextFeild()
	{
		return MobileTextFeild;
		
	}
	public WebElement getemailTextFeild()
	{
		return emailTextFeild;
		
	}
	public WebElement getnoOfEmployeesTextFeild()
	{
		return noOfEmployeesTextFeild;
		
	}
	public WebElement getcityTextFeild()
	{
		return cityTextFeild;
		
	}
	public WebElement getcountryTextFeild()
	{
		return countryTextFeild;
		
	}
	public WebElement getstatetextFeild()
	{
		return statetextFeild;
		
	}
	public WebElement getsaveButton()
	{
		return saveButton;
	}
	 
	public void CreatingNewLeadPage(String fname,String lname,String company)
	{
		getFristnameTextField().sendKeys(fname);
		getLastNAmeTextField().sendKeys(lname);
		getCompanyTextFied().sendKeys(company);
		getsaveButton().click();
	}
	
	public void CreatingNewLeadPage(String fname,String lname,String company,String title,String mobile,String email)
	{
		getFristnameTextField().sendKeys(fname);
		getLastNAmeTextField().sendKeys(lname);
		getCompanyTextFied().sendKeys(company);
		getTitletextFeild().sendKeys(title);
		getMobileTextFeild().sendKeys(mobile);
		getemailTextFeild().sendKeys(email);
		getsaveButton().click();
	}
	public void CreatingNewLeadPage(String lname,String company,String leadSource,String noOFEmp,String city,String country,String state) 
	{
		getLastNAmeTextField().sendKeys(lname);
		getCompanyTextFied().sendKeys(company);
		Select sel = new Select(getLeadsourceDropDown());
		sel.selectByValue(leadSource);
		getnoOfEmployeesTextFeild().sendKeys(noOFEmp);
		getcityTextFeild().sendKeys(city);
		getcountryTextFeild().sendKeys(country);
		getstatetextFeild().sendKeys(state);
		getsaveButton().click();
	}
	 
	
}


















