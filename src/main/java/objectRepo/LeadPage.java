package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadPage 
{
	@FindBy(xpath="//img[@title='Create Lead...']")
	private WebElement CreateNewLeadIcon;
	
	public LeadPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getCreateNewLeadIcon()
	{
		return CreateNewLeadIcon;	
	}
	public void ClickONCreateNewLeadIcon()
	{
		getCreateNewLeadIcon().click();
	}

}
