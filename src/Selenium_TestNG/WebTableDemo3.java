package Selenium_TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class WebTableDemo3
{
	@Test
	public void webTable()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chrome 109\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://money.rediff.com/gainers");
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		
		List<WebElement> curentPrice = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr/td[4]"));
		
		int curentPriceList = curentPrice.size();
		
		System.out.println(curentPriceList);   
		
		String xpath1 = "//*[@id='leftcontainer']/table/tbody/tr["; 
		
		String xpath2 = "]/td[4]";
		
		for(int i = 1; i<=curentPriceList; i++)
		{
			String companies = driver.findElement(By.xpath(xpath1+i+xpath2)).getText();
			System.out.println(companies);
		}
		
		System.out.println("Done");
		
		driver.quit();
		
	}
	

}
