package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public class AlertPopUp  {
	@Test
	public void alert() {
		FirefoxOptions options=new FirefoxOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver driver=new FirefoxDriver(options);
		driver.get("https://www.flipkart.com/");
		
		
		
	}

}
