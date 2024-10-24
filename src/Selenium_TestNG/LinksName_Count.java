package Selenium_TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LinksName_Count 
{
	@Test
	public void linkNames()
	{

		System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chrome 109\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.bbc.com/");

		List< WebElement> allLinks = driver.findElements(By.xpath("//a"));

		int countOfLinks = allLinks.size();

		System.out.println("countOfLinks  :" + countOfLinks);

		for(int i=0; i<countOfLinks; i++)
		{

			String link = allLinks.get(i).getAttribute("href");
			System.out.println(link);
		}

		System.out.println("Done");

		driver.quit();
	}

}
