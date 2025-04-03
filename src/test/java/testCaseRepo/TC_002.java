package testCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.CreatingNewLeadPage;
import objectRepo.HomepPage;
import objectRepo.LeadPage;

public class TC_002 extends BaseClass
{
	@Test
	public void LE_002() throws EncryptedDocumentException, IOException
	{
		HomepPage hp = new HomepPage(driver);
		hp.ClickOnLeadsMenu();
		
		LeadPage lep=new LeadPage(driver);
		lep.ClickONCreateNewLeadIcon();
		
		String fName=eUtil.getDataFromExcelFile("Leads", 5, 1);
		String lName=eUtil.getDataFromExcelFile("Leads", 5, 2);
		String company=eUtil.getDataFromExcelFile("Leads", 5, 3);
		String title=eUtil.getDataFromExcelFile("Leads", 5, 4);
		String mobile=eUtil.getDataFromExcelFile("Leads", 5, 5);
		String email=eUtil.getDataFromExcelFile("Leads", 5, 6);
		CreatingNewLeadPage cnlp=new CreatingNewLeadPage(driver);
		cnlp.CreatingNewLeadPage(fName, lName, company, title, mobile, email);
		
		
		
		
	}
	@Test
	public void Demo()
	{
		System.out.println("Tata");
	}


}
