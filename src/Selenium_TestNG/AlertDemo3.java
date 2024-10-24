package Selenium_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertDemo3 
{
	@Test
	public void lightBox() throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chrome 109\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.meghanabus.in/index.html");

		Thread.sleep(5000);

		WebElement mainAlert = driver.findElement(By.xpath("//*[@id='close']/img"));

		mainAlert.click();

		WebElement manageBooking = driver.findElement(By.xpath("//*[@id='navbar-menu']/ul[1]/li[2]/a"));

		manageBooking.click();

		Thread.sleep(4000);

		WebElement search = driver.findElement(By.xpath("//*[@id='ticketForm']/div[3]/div/button"));

		search.click();

		Thread.sleep(4000);

		String alertText = driver.switchTo().alert().getText();
		
		System.out.println(alertText);
		
		driver.switchTo().alert().accept();

		Thread.sleep(2000);

		WebElement alert = driver.findElement(By.xpath("//*[@id='manage_booking']/div[1]/div[1]/div[1]/span"));

		String data = alert.getText();

		System.out.println(data);

		System.out.println("Done");

		driver.quit();
	}

}
