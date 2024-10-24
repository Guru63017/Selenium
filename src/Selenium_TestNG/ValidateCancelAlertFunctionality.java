package Selenium_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidateCancelAlertFunctionality
{
	@Test
	public void validateCancelAlert() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chrome 109\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html#google_vignette");
		Thread.sleep(2000);
		WebElement clickme = driver.findElement(By.xpath("//*[@id='confirmBox']"));

		clickme.click();
		Thread.sleep(2000);
		String alertTextActual = driver.switchTo().alert().getText();

		System.out.println(alertTextActual);

		String expectedData = "Press a button!";

		Assert.assertEquals(alertTextActual, expectedData,"match");

		driver.switchTo().alert().dismiss();

		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).perform();

		Thread.sleep(2000);
		WebElement popUpAlert = driver.findElement(By.xpath("//*[@id='output']"));

		String actualAlertData = popUpAlert.getText();

		System.out.println(actualAlertData);

		String expectedAlertData = "You pressed Cancel in confirmation popup";
		Assert.assertEquals(actualAlertData, expectedAlertData,"not matched");
		System.out.println("Done");
		driver.quit();

	}

}