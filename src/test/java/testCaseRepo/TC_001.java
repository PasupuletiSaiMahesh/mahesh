package testCaseRepo;


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import genericUtility.BaseClass;
import objectRepo.CreatingNewLeadPage;
import objectRepo.HomepPage;
import objectRepo.LeadPage;

@Listeners(genericUtility.ListenersImplementation.class)
public class TC_001 extends BaseClass
{
	@Test
	public void LE_001() throws EncryptedDocumentException, IOException
	{
		HomepPage hp = new HomepPage(driver);
		hp.ClickOnLeadsMenu();
		
		LeadPage lep = new LeadPage(driver);
		lep.ClickONCreateNewLeadIcon();
		
		
		String fName=eUtil.getDataFromExcelFile("Leads", 2, 1);
		String lName=eUtil.getDataFromExcelFile("Leads", 2, 2);
		String company=eUtil.getDataFromExcelFile("Leads", 2, 3);
	//	Assert.fail();
		
		CreatingNewLeadPage cnlp = new CreatingNewLeadPage(driver);
		cnlp.CreatingNewLeadPage(fName, lName, company);
	}
	
	@Test
	public void Demo()
	{
		System.out.println("Tata");
	}

}
