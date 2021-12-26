package com.spicejet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class PassengersPage {
	WebDriver driver;

	public PassengersPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@data-testid='title-contact-detail-card']/descendant::*[name()='svg']")
	private WebElement titleBtn;
	
	@FindBy(xpath = "//input[@data-testid='first-inputbox-contact-details']")
	private WebElement contactFirstName;
	@FindBy(xpath = "//input[@data-testid='last-inputbox-contact-details']")
	private WebElement contactLastName;
	
	@FindBy(xpath = "//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-poiln3 r-ubezar']/ancestor::div[@data-testid='contact-number-country-selection']")
	private WebElement countryCode;
	@FindBy(xpath = "//input[@placeholder='Search']")
	private WebElement searchBox;
	
	@FindBy(xpath = "//input[@data-testid='contact-number-input-box']")
	private WebElement phoneNo;
	@FindBy(xpath ="//input[@data-testid='emailAddress-inputbox-contact-details']")
	private WebElement emailId;
	@FindBy(xpath ="//input[@data-testid='city-inputbox-contact-details']")
	private WebElement town;
	
	@FindBy(xpath ="//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-tmtnm0 r-1777fci r-ymttw5 r-5njf8e r-1otgn73 r-13qz1uu']/descendant::*[name()='svg']")
	private WebElement countryBtn;
	@FindBy(xpath = "//input[@placeholder='Search']")
	private WebElement countryDropdwn;
	
	@FindBy(xpath = "//div[@class='css-76zvg2 r-qsz3a2 r-poiln3 r-1b43r93 r-16dba41' and contains(.,'Retain my details for the next visit.')]/ancestor::div[@class='css-1dbjc4n r-18u37iz']/descendant::*[name()='svg']")
	private WebElement checkBox1;
	@FindBy(xpath = "//div[@class='css-76zvg2 r-qsz3a2 r-poiln3 r-1b43r93 r-16dba41']/ancestor::div[@class='css-1dbjc4n r-18u37iz r-y3xmzu']/descendant::*[name()='svg']")
	private WebElement checkBox2;
	@FindBy(xpath = "//div[@class='css-76zvg2 r-qsz3a2 r-poiln3 r-1b43r93 r-16dba41']/ancestor::div[@class='css-1dbjc4n r-13awgt0']/descendant::*[name()='svg']")
	private WebElement checkBox3;
	
	@FindBy(xpath = "//div[text()='Next']")
	private WebElement nextBtn;
	
	@FindBy(xpath = "//div[@data-testid='traveller-info-continue-cta']")
	private WebElement continueBtn;
	
	public WebElement getNextBtn() {
		return nextBtn;
	}
	public WebElement getContinueBtn() {
		return continueBtn;
	}
	public WebElement getCheckBox1() {
		return checkBox1;
	}
	public WebElement getCheckBox2() {
		return checkBox2;
	}
	public WebElement getCheckBox3() {
		return checkBox3;
	}
	public WebElement getCountryBtn() {
		return countryBtn;
	}
	public WebElement getCountryDropdwn() {
		return countryDropdwn;
	}
	public WebElement getPhoneNo() {
		return phoneNo;
	}
	public WebElement getEmailId() {
		return emailId;
	}
	public WebElement getTown() {
		return town;
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getTitleBtn() {
		return titleBtn;
	}
	public WebElement getContactFirstName() {
		return contactFirstName;
	}
	public WebElement getContactLastName() {
		return contactLastName;
	}
	public WebElement getCountryCode() {
		return countryCode;
	}
	public WebElement getSearchBox() {
		return searchBox;
	}
	

}
