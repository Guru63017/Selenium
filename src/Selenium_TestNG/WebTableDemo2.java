package Selenium_TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableDemo2
{
	@Test
	public void webTable()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chrome 109\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://money.rediff.com/gainers");
		
		List<WebElement> companyNames = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
		
		int companyNamesList = companyNames.size();
		
		System.out.println(companyNamesList);
		
		String xpath1 = "//*[@id='leftcontainer']/table/tbody/tr[";
		
		String xpath2 = "]/td[1]";
		
		for(int i = 1; i<=companyNamesList; i++)
		{
			String companies = driver.findElement(By.xpath(xpath1+i+xpath2)).getText();
			System.out.println(companies);
		}
		
		System.out.println("Done");
		
		driver.quit();
				
	}
	

}
