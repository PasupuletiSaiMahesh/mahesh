package testCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.CreatingNewLeadPage;
import objectRepo.HomepPage;
import objectRepo.LeadPage;

public class TC_003 extends BaseClass
{
	@Test
	public void LE_003() throws EncryptedDocumentException, IOException
	{
		HomepPage hp = new HomepPage(driver);
		hp.ClickOnLeadsMenu();
		
		LeadPage lep=new LeadPage(driver);
		lep.ClickONCreateNewLeadIcon();
		
		String lName=eUtil.getDataFromExcelFile("Leads", 8, 1);
		String company=eUtil.getDataFromExcelFile("Leads",8, 2);
		String LeadSource=eUtil.getDataFromExcelFile("Leads", 8, 3);
		String noOfEmp=eUtil.getDataFromExcelFile("Leads", 8, 4);
		String City=eUtil.getDataFromExcelFile("Leads", 8, 5);
		String country=eUtil.getDataFromExcelFile("Leads", 8, 6);
		String state=eUtil.getDataFromExcelFile("Leads", 8, 7);
		CreatingNewLeadPage cnlp=new CreatingNewLeadPage(driver);
		cnlp.CreatingNewLeadPage(lName, company, LeadSource, noOfEmp, City, country, state);
		
		
		
		
	}

}
