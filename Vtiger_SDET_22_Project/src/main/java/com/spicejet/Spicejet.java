package com.spicejet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Spicejet {
	WebDriver driver;

	public Spicejet(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[text()='Flights']")
	private WebElement FlightTabBtn;
	
	@FindBy(xpath="//div[text()='one way']")
	private WebElement OnwayRadioBtn;
	
	@FindBy(xpath="//div[@data-testid='to-testID-origin']")
	private WebElement FromDropdownList;
	
	@FindBy(xpath="//div[@data-testid='to-testID-destination']")
	private WebElement ToDropdownList;
	
	@FindBy(xpath="//div[text()='From']/following-sibling::div/input")
	private WebElement SelectFromDestination;
	

	@FindBy(xpath="//div[text()='To']/following-sibling::div/input")
	private WebElement SelectToDestination;
	
	@FindBy(xpath="//div[@data-testid='home-page-flight-cta']")
	private WebElement SearchFlightBtn;
	

	public WebElement getFlightTabBtn() {
		return FlightTabBtn;
	}


	public WebElement getOnwayRadioBtn() {
		return OnwayRadioBtn;
	}

	public WebElement getFromDropdownList() {
		return FromDropdownList;
	}

	public WebElement getToDropdownList() {
		return ToDropdownList;
	}
	
	public WebElement getSelectFromDestination() {
		return SelectFromDestination;
	}

	public WebElement getSelectToDestination() {
		return SelectToDestination;
	}


	public WebElement getSearchFlightBtn() {
		return SearchFlightBtn;
	}
	

}
