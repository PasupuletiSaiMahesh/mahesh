package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	//Locating WebElement
	@FindBy(name="user_name")
	private WebElement usernameTextField;
	
	@FindBy(name="user_password")
	private WebElement passwordTextField;
	
	@FindBy(id="submitButton")
	private WebElement loginbutton;
	
	//Initialzing WebElement
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Getter method
	public WebElement getUsernameTextField()
	{
		return usernameTextField;
		
	}
	public WebElement getPasswordTextField()
	{
		return passwordTextField;
		
	}
	public WebElement getLoginButton()
	{
		return loginbutton;
		
	}
	
	public void loginToApplication(String username,String password)
	{
		getUsernameTextField().sendKeys(username);
		getPasswordTextField().sendKeys(password);
		getLoginButton().click();
	}
	

}
