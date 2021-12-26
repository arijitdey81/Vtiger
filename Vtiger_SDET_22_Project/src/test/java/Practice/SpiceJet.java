package Practice;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import com.crm.vtiger.GenericUtils.BaseClass;
import com.crm.vtiger.GenericUtils.ExcelUtility;
import com.crm.vtiger.GenericUtils.IPathConstant;
import com.crm.vtiger.GenericUtils.JavaUtility;
import com.spicejet.AddOnsPage;
import com.spicejet.PassengersPage;
import com.spicejet.SearchPlaneSpicejet;
import com.spicejet.Spicejet;

public class SpiceJet  {
	@Test
	public void bookTicket() throws Throwable {
		
		ExcelUtility eUtil=new ExcelUtility();
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com");
		
		Spicejet spj=new Spicejet(driver);
		spj.getFlightTabBtn().click(); // Clicking on Flight Button
		spj.getOnwayRadioBtn().click(); //Clicking on OnWay Radio Button
		
		spj.getFromDropdownList().click(); //Clicking on From Destination Dropdown list
		spj.getSelectFromDestination().sendKeys("CCU"); //Selecting particular Destination in From Destination 
	    Thread.sleep(2000);
	    
	    spj.getToDropdownList().click(); // Clicking on To Destination Dropdown list
	    spj.getSelectToDestination().sendKeys("BLR"); //Selecting particular Destination in To Destination
	    Thread.sleep(2000);
	    selectDate(driver, "15", "December", "2021");
	    
	    driver.findElement(By.xpath("//div[@data-testid='return-date-dropdown-label-test-id']/descendant::*[name()='svg'][1]")).click();
	    selectDate(driver, "30", "December", "2021");
		
	    driver.findElement(By.xpath("//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar']/ancestor::div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-5njf8e r-1otgn73']")).click();
		
	    //driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
	    //driver.findElement(By.xpath("//div[@data-testid='Adult-testID-minus-one-cta']")).click();
	    //driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
	    
		 spj.getSearchFlightBtn().click();// clicking on Search Flight Button
		  
		 SearchPlaneSpicejet spsj=new SearchPlaneSpicejet(driver);
		 spsj.getFirstDirectRadioBtn().click();
		 driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-1sgu7fw r-1ljd8xs r-1phboty r-1777fci r-e9bn0q']/descendant::*[name()='svg'])[4]")).click();
	     Thread.sleep(2000);
		 JavascriptExecutor jse=(JavascriptExecutor) driver;
		 int y = driver.findElement(By.xpath("//div[@class='css-76zvg2 r-homxoj r-adyw6z r-1kfrs79' and text()='Return Flight to']")).getLocation().getY(); 
		
		 jse.executeScript("window.scrollBy(0,"+y+")");
		
		 Thread.sleep(2000);
	
		  spsj.getSecondDirectRadioBtn().click();
	   driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-1sgu7fw r-1ljd8xs r-1phboty r-1777fci r-e9bn0q']/descendant::*[name()='svg'])[10]")).click(); 
	    spsj.getContinueSelectBtn().click(); //Selecting Flight Money and continue
	    
	    /*--------------Passenger Page---------------*/ 
	    PassengersPage passp=new PassengersPage(driver);
	    passp.getTitleBtn().click();
	    
	    List<WebElement> titleList = driver.findElements(By.xpath("//div[@class='css-76zvg2 r-homxoj r-poiln3 r-ubezar']"));
	    String expectedTitle="Mr";
	    for(int i=0;i<titleList.size();i++)
	    {
	    	String actualTitle = titleList.get(i).getText();
			if(actualTitle.contains(expectedTitle))
			{
					titleList.get(i).click();
			         break;
			}
	    }
	    //Selecting Contact First Name from Excel
	    String contactFirstName=eUtil.getExcelData("Sheet1", 1, 1);
	    passp.getContactFirstName().sendKeys(contactFirstName);
	    //Selecting Contact Last Name from Excel
	    String contactLastName=eUtil.getExcelData("Sheet1", 1, 3);
	    passp.getContactLastName().sendKeys(contactLastName);
	    
	    //Selecting Country Code for phone no
	    passp.getCountryCode().click();
	    passp.getSearchBox().sendKeys("I");
	    List<WebElement> phoneCode = driver.findElements(By.xpath("//div[@class='css-1dbjc4n']//ancestor::div[@class='css-1dbjc4n r-14lw9ot r-z2wwpe r-1rjd0u6 r-1g94qm0 r-h3f8nf r-1dqxon3 r-u8s1d r-12kfsgm r-8fdsdq']/descendant::div[@class='css-76zvg2 r-poiln3 r-1b43r93 r-193dp3']"));
	    
	    String expected ="+91";
		for(int i=0;i<phoneCode.size();i++)
		{
			String actualText = phoneCode.get(i).getText();
			if(actualText.contains(expected))
			{
					phoneCode.get(i).click();
			         break;
			}
		}
		//Selecting Contact phone No from Excel
		Thread.sleep(2000);
		String phoneNo=eUtil.getExcelData("Sheet1", 1, 4);
		passp.getPhoneNo().sendKeys(phoneNo);
		//Selecting Contact Email Id from Excel
		String mailId = eUtil.getExcelData("Sheet1", 1, 5);
		passp.getEmailId().sendKeys(mailId);
		//Selecting Contact's town from Excel
		String town = eUtil.getExcelData("Sheet1", 1, 6);
		passp.getTown().sendKeys(town);
		//Selecting Country
		passp.getCountryBtn().click();
		passp.getCountryDropdwn().sendKeys("I");
		
		List<WebElement> countryList = driver.findElements(By.xpath("//div[@class='css-1dbjc4n r-1dqxon3']/descendant::div[@class='css-76zvg2 r-qsz3a2 r-poiln3 r-n6v787 r-1e081e0 r-oyd9sg']"));
		String expectedCountry="Italy";
		for(WebElement country:countryList) {
			String actualCountry=country.getText();
			if(actualCountry.contains(expectedCountry))
			{
				country.click();
				break;
			}
			
		}
		//Handing checkboxes
		passp.getCheckBox1().click();
		passp.getCheckBox2().click();
		passp.getCheckBox3().click();
		//passp.getNextBtn().click();
		passp.getContinueBtn().click();
		Thread.sleep(4000);
		AddOnsPage aop=new AddOnsPage(driver);
		aop.getContinueButton().click();
	}
	
	public static void selectDate(WebDriver driver,String date, String month, String year) {
		
		int MONTH=12;
	    while(MONTH>0) 
		{
	      try {
	        driver.findElement(By.xpath("//div[contains(@data-testid,'undefined-month-"+month+"-"+year+"')]/descendant::div[text()='"+date+"']")).click();
	        break;
	      } catch (Exception e) {
	        driver.findElement(By.xpath("//div[@data-testid='undefined-calendar-picker']/descendant::*[name()='svg'][1]")).click();
	        MONTH--;
	      }
	    }
		
	}
	
//  public static String getCity(String cityName) {
//  HashMap<String, String> cities=new HashMap<>();
//  cities.put("Goa", "GOI");
//  cities.put("Ahmedabad", "AMD");
//  
//  return cities.get(cityName);
//}

}
