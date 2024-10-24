package Selenium_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TittleDemo2 
{
	@Test
	public void Mercurylogin()
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chrome 109\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.guru99.com/test/newtours/index.php");

		WebElement userName = driver.findElement(By.xpath("//input[@type='text']"));

		userName.sendKeys("mercury");

		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));

		pass.sendKeys("mercury");

		driver.findElement(By.xpath("//input[@type='submit']")).click();

		String actualTittle = driver.getTitle();
		System.out.println(actualTittle);

		String expectedTittle = "Login: Mercury Tours";

		Assert.assertEquals(actualTittle, expectedTittle);
	}

}
