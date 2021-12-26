package scriptsContacts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;

public class tc_01_cucumberTest {
		WebDriver driver=new ChromeDriver();
		@Given("Enter the Url")
		public void openBrowser() {
			driver.get("http://localhost:8888/");
			
		}
}
