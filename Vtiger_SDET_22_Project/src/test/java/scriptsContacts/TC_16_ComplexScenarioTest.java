package scriptsContacts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.crm.vtiger.GenericUtils.BaseClass;
import com.crm.vtiger.pomrepositorylib.Contacts;
import com.crm.vtiger.pomrepositorylib.CreateNewContact;
import com.crm.vtiger.pomrepositorylib.CreateOrganizations;
import com.crm.vtiger.pomrepositorylib.EditOrganizationPage;
import com.crm.vtiger.pomrepositorylib.HomePage;
import com.crm.vtiger.pomrepositorylib.OrganisationInfo;


public class TC_16_ComplexScenarioTest extends BaseClass {
	@Test
	public void complexScenario() throws Throwable, IOException {
		
		//step : navigate to Organisation page
		HomePage home=new HomePage(driver);
		home.getOrganizationLink().click();
		
		//step : navigate to Create Organzation page
		CreateOrganizations cOrgP=new CreateOrganizations(driver);
		cOrgP.getcreateOrganizationtImg().click();
		
		
		//read Organization test data
		EditOrganizationPage edtOrgPage=new EditOrganizationPage(driver);
		String organisationName = eUtil.getExcelData("Sheet1", 1, 2)+"_"+jUtil.getRandomData();
		edtOrgPage.createOrganization(organisationName);
		edtOrgPage.getOrgSaveBtn().click();
		
		//step : verify the organization information page
		OrganisationInfo orgInform=new OrganisationInfo(driver);
		String text = orgInform.getOrgSuccessfullMsg().getText();
		
		SoftAssert sassert=new SoftAssert();
		sassert.assertTrue(text.contains(organisationName));
		System.out.println("Organization is created successfully");
		
		//step : navigate to contacts page
		wUtil.waitUntilPageLoad(driver);
		home.getContactsLink().click();
		
		//step :navigate to "create contacts" page
		Contacts contPage=new Contacts(driver);
		contPage.getCreateContactImg().click();
		
		//read Contact test data
		CreateNewContact cncp=new CreateNewContact(driver);
		String contactLastName = eUtil.getExcelData("Sheet1", 1, 1)+"_"+jUtil.getRandomData();
		cncp.createContact(contactLastName);
		
		
		
		
	}

}
