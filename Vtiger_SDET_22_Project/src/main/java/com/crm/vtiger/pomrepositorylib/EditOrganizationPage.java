package com.crm.vtiger.pomrepositorylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditOrganizationPage {
	WebDriver driver;
	public EditOrganizationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='accountname']")
	private WebElement OraganisationNameTxtBox;
	
	@FindBy(xpath="(//input[@title='Save [Alt+S]'])[1]")
	private WebElement orgSaveBtn;
	
	public WebElement getOraganisationNameTxtBox() {
		return OraganisationNameTxtBox;
	}

	public WebElement getOrgSaveBtn() {
		return orgSaveBtn;
	}
	
	public void createOrganization(String organisationName) {
		OraganisationNameTxtBox.sendKeys(organisationName);
		
		
	}

}
