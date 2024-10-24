package Selenium_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidatePromptAlertFunctionality 
{
	@Test
	public void ValidatePromptAlert() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chrome 109\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html#google_vignette");
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		WebElement clickme = driver.findElement(By.xpath("//*[@id='promptBox']"));

		clickme.click();
		
		String alertTextActual = driver.switchTo().alert().getText();

		System.out.println(alertTextActual);

		String expectedData = "Please enter your name:";

		Assert.assertEquals(alertTextActual, expectedData,"match");

		driver.switchTo().alert().sendKeys("RBG Technologies");

		driver.switchTo().alert().accept();

		WebElement popUpAlert = driver.findElement(By.xpath("//*[@id='output']"));

		String actualAlertData = popUpAlert.getText();
		Thread.sleep(2000);
		
		System.out.println(actualAlertData);

		String expectedAlertData = "You entered text RBG Technologies in propmt popup";
		Assert.assertEquals(actualAlertData, expectedAlertData,"matched");
		System.out.println("Done");
		driver.quit();

	}

}
