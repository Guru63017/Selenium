package Selenium_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class DropDownDemo1 
{
	@Test
	public void dropDownTest() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chrome 109\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://demo.guru99.com/test/newtours/reservation.php");
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@name='toMonth']"));
		
		WebElement move = driver.findElement(By.xpath("//select[@name='airline']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(move).perform();
		
		Thread.sleep(2000);
		
//		dropdown.click();
		
		Select sec = new Select(dropdown);
		
		sec.selectByValue("6");
		
		sec.selectByIndex(5);
		
		sec.selectByVisibleText("May");
		
		move.click();
		
		System.out.println("Done");
	}
}
