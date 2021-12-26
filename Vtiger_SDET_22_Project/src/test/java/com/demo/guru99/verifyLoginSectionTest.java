package com.demo.guru99;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class verifyLoginSectionTest {
	@Test
	public void loginTest() {
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/");
		
		
	}

}
