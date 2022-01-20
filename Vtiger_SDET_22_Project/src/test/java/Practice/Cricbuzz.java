package Practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Cricbuzz {

	@Test
	public void wicketTaken() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.cricbuzz.com/");
		driver.findElement(By.xpath("//li[@class='cb-col cb-col-25 cb-mtch-blk cb-vid-sml-card-api videos-carousal-item cb-carousal-item-large cb-view-all-ga']/descendant::a[@title=\"Australia v England - 1st Test\"]")).click();
		driver.findElement(By.xpath("//a[@class='cb-nav-tab ' and text()='Scorecard']")).click();
		List<WebElement> engBowlerTknWcktList = driver.findElements(By.xpath("//div[contains(.,' Joe Root (c) ') and @class='cb-col cb-col-100 cb-ltst-wgt-hdr']/descendant::div[@class='cb-col cb-col-8 text-right text-bold']"));
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		for(WebElement wicket:engBowlerTknWcktList) {
			String text = wicket.getText();
			int w=Integer.parseInt(text);
			list.add(w);
		}
		Collections.sort(list);
		System.out.println(list.get(list.size()-1));
		driver.close();
	}

}
