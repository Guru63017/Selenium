package Selenium_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHoverDemo2
{


	@Test
	public void Mercurylogin() throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chrome 109\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");

		WebElement flag = driver.findElement(By.xpath("//*[@id='icp-nav-flyout']/span/span[2]/span[2]"));

		Actions act = new Actions(driver);
		act.moveToElement(flag).perform();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id='icp-flyout-mkt-change']/span/div")).click();

		System.out.println("Done");

		driver.quit();
	}

}
