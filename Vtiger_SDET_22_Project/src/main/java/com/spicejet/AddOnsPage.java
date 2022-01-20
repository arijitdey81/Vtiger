package com.spicejet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddOnsPage {
	WebDriver driver;

	public AddOnsPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[text()='Continue']")
	private WebElement continueButton;

	public WebElement getContinueButton() {
		return continueButton;
	}
	
}
