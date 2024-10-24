package Selenium_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DropDownDemo3
{
	@Test
	public void originPlace() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chrome 109\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://www.meghanabus.in/index.html");
		
		Thread.sleep(6000);
		
		Actions act = new Actions(driver);
		act.click().perform();
		
		WebElement originPlace = driver.findElement(By.xpath("//*[@id='search-origin']/div[1]/div/div/div[1]"));
		
		originPlace.click();
						
		act.sendKeys("amalapuram").click().perform();
		
		System.out.println("Done");
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}
	

}
