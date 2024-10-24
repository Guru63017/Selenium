package Selenium_TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LinksDemo1 
{
	@Test
	public void linksCount()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chrome 109\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.bbc.com/");
		
		List< WebElement> allLinks = driver.findElements(By.xpath("//a"));
		
		int countOfLinks = allLinks.size();
		
		System.out.println("countOfLinks  :" + countOfLinks);
		
		System.out.println("Done");
		
		driver.quit();
	}

}
