package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class irctcTest {
	@Test
	public void searchTrain() throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/");
		
		driver.findElement(By.xpath("//div[@class='text-center col-xs-12']/button")).click();
		
		driver.findElement(By.xpath("//span[@class='ng-tns-c58-8 ui-autocomplete ui-widget']/input")).sendKeys("KOL");
		Thread.sleep(3000);
		
		List<WebElement> list = driver.findElements(By.xpath("//li[@role='option']"));
		String expected ="KOLKATA";
		for(int i=0;i<list.size();i++)
		{
			String actualText = list.get(i).getText();
			if(actualText.contains(expected))
			{
			         list.get(i).click();
			         break;
			}
		}
		
		
		driver.findElement(By.xpath("//span[@class='ng-tns-c58-9 ui-autocomplete ui-widget']/input")).sendKeys("MUM");
		Thread.sleep(3000);
		List<WebElement> list1 = driver.findElements(By.xpath("//li[@role='option']"));
		String expected1 = "MUMBAI";
		for(int j=0;j<list1.size();j++)
		{
			String autualText1 = list1.get(j).getText();
			if(autualText1.contains(expected1))
			{
				list1.get(j).click();
				break;
			}
		
		}
		
		
		driver.findElement(By.xpath("//span[@class='ng-tns-c59-10 ui-calendar']")).click();
		driver.findElement(By.xpath("//table/tbody/tr[5]/td[3]")).click();
		
		driver.findElement(By.xpath("//span[@class='ui-dropdown-trigger-icon ui-clickable ng-tns-c66-11 pi pi-chevron-down']")).click();
		driver.findElement(By.xpath("//span[@class='ng-star-inserted' and text()='AC First Class (1A) ']")).click();
		
		driver.findElement(By.xpath("//span[@class='ui-dropdown-trigger-icon ui-clickable ng-tns-c66-12 pi pi-chevron-down']")).click();
		driver.findElement(By.xpath("//span[@class='ng-star-inserted' and text()='PREMIUM TATKAL']")).click();
		
		driver.findElement(By.xpath("//label[@for='availableBerth']")).click();
		driver.findElement(By.xpath("//button[@class='search_btn train_Search']")).click();
		
	}

}
