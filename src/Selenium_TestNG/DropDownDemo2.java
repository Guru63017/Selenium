package Selenium_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownDemo2
{
	@Test
	public void originPlace() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chrome 109\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://demo.guru99.com/test/newtours/reservation.php");
		
		WebElement arrivingIn = driver.findElement(By.xpath("//select[@name='toPort']"));
		
		WebElement move = driver.findElement(By.xpath("//select[@name='airline']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(move).perform();

		Thread.sleep(2000);
				
		Select sec = new Select(arrivingIn);
		
//		sec.selectByValue("New York");
		
//		sec.selectByIndex(5);
//		
		sec.selectByVisibleText("New York");
		
		Thread.sleep(3000);
		
		System.out.println("Done");
	
		driver.quit();

	}
}
