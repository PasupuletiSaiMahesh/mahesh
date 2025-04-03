package testCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.ContactsPage;
import objectRepo.CreateNewContactPage;
import objectRepo.HomepPage;

public class TC_006 extends BaseClass
{
	@Test
	public void con_003() throws EncryptedDocumentException, IOException
	{
		HomepPage hp=new HomepPage(driver);
		hp.clickOnContactsMenu();
		
		ContactsPage cp=new ContactsPage(driver);
		cp.ClickOnCreateNewContactsIcon();
		
		String lName=eUtil.getDataFromExcelFile("Contacts", 7, 1);
		String email=eUtil.getDataFromExcelFile("Contacts", 7, 2);
		String mobile=eUtil.getDataFromExcelFile("Contacts", 7,3);
		String mCity=eUtil.getDataFromExcelFile("Contacts", 7, 4);
		String mstate=eUtil.getDataFromExcelFile("Contacts", 7, 5);
		String mCountry=eUtil.getDataFromExcelFile("Contacts", 7, 6);
		
		
		CreateNewContactPage cncp=new CreateNewContactPage(driver);
		cncp.CreateNewContactPage(lName, email, mobile, mCity, mstate, mCountry);
		
		
	}

}
