package Selenium_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TittleDemo1 
{
	@Test
	public void tittle() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chrome 109\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
				
		String tittle = driver.getTitle();
		
		System.out.println(tittle);
		
		String expectedTittle = "Find a Flight: Mercury Tours: ";
		
		String actualTittle = driver.getTitle();
		
		Assert.assertEquals(actualTittle, expectedTittle);
		
	}

}
