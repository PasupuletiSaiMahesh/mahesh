package testCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.ContactsPage;
import objectRepo.CreateNewContactPage;
import objectRepo.HomepPage;

public class TC_004 extends BaseClass
{
	@Test
	public void con_001() throws EncryptedDocumentException, IOException
	{
		HomepPage hp=new HomepPage(driver);
		hp.clickOnContactsMenu();
		
		ContactsPage cp=new ContactsPage(driver);
		cp.ClickOnCreateNewContactsIcon();
		
		String lName=eUtil.getDataFromExcelFile("Contacts", 1, 1);
		String title=eUtil.getDataFromExcelFile("Contacts", 1, 2);
		String dept=eUtil.getDataFromExcelFile("Contacts", 1, 3);
		CreateNewContactPage cncp=new CreateNewContactPage(driver);
		cncp.CreateNewContactPage(lName, title, dept);
	}

}
