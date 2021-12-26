package com.spicejet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPlaneSpicejet {
	WebDriver driver;

	public SearchPlaneSpicejet(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(xpath="(//div[text()='Direct'])[1]")
	private WebElement FirstDirectRadioBtn;
	
	@FindBy(xpath="(//div[text()='Direct'])[4]")
	private WebElement SecondDirectRadioBtn;
	
	@FindBy(xpath="//div[@data-testid='continue-search-page-cta']")
	private WebElement ContinueSelectBtn;

	public WebElement getFirstDirectRadioBtn() {
		return FirstDirectRadioBtn;
	}

	public WebElement getSecondDirectRadioBtn() {
		return SecondDirectRadioBtn;
	}

	public WebElement getContinueSelectBtn() {
		return ContinueSelectBtn;
	}
		
	
}
