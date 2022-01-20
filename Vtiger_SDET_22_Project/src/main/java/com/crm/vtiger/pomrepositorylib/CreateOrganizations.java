package com.crm.vtiger.pomrepositorylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrganizations {
	WebDriver driver;
	public CreateOrganizations(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[@alt='Create Organization...']")
	private WebElement createOrganizationtImg;
	
	public WebElement getcreateOrganizationtImg() {
		return createOrganizationtImg;
	}

	
}
