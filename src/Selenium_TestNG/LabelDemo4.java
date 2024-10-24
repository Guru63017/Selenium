package Selenium_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LabelDemo4 
{
	@Test
	public void label() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chrome 109\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://only-testing-blog.blogspot.com/2015/01/iframe1.html");

		driver.switchTo().frame("frame1"); //string

		WebElement text = driver.findElement(By.xpath("//*[@id='Blog1']/div[1]/div/h2/span"));

		String expectedData = "Saturday, 3 January 2015";  

		String actualData = text.getText();

		System.out.println(actualData);

		String exception = "actual Data is Matched";
		
		Assert.assertEquals(actualData, expectedData,exception);
		
		System.out.println("Done");
	}
}
