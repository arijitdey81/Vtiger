package com.crm.vtiger.pomrepositorylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganisationInfo {
	WebDriver driver;
	public OrganisationInfo(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className = "dvHeaderText")
	private WebElement orgSuccessfullMsg;
	
	public WebElement getOrgSuccessfullMsg() {
		return orgSuccessfullMsg;
	}
	
	

}
