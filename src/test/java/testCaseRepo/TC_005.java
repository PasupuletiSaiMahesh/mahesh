package testCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.ContactsPage;
import objectRepo.CreateNewContactPage;
import objectRepo.HomepPage;

public class TC_005 extends BaseClass
{
	@Test
	public void con_002() throws EncryptedDocumentException, IOException
	{
		HomepPage hp=new HomepPage(driver);
		hp.clickOnContactsMenu();
		
		ContactsPage cp=new ContactsPage(driver);
		cp.ClickOnCreateNewContactsIcon();
		
	 
		String lName=eUtil.getDataFromExcelFile("Contacts", 4, 1);
		String email=eUtil.getDataFromExcelFile("Contacts", 4, 2);
		String mobile=eUtil.getDataFromExcelFile("Contacts", 4,3);
		String mCity=eUtil.getDataFromExcelFile("Contacts", 4, 4);
 
		 
		CreateNewContactPage cncp=new CreateNewContactPage(driver);
		cncp.CreateNewContactPage(lName, email, mobile, mCity);
	}

}
