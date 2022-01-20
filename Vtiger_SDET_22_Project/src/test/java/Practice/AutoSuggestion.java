package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutoSuggestion {

	@Test
	public void amazonSuggestion() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone");
		List<WebElement> allsugg = driver.findElements(By.xpath("//span[@class='s-heavy']"));
		for(int i=0;i<allsugg.size();i++)
		{
			String text = allsugg.get(0).getText();
			System.out.println(text);
		}
		
	}

}
