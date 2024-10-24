package Selenium_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IframeSwitches
{
	@Test
	public void iframes() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chrome 109\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("file:///C:/Users/malli/Downloads/Iframe1%20(1).html");
		
		driver.switchTo().frame("iframe_a");
		
		driver.switchTo().frame("frame1");

		WebElement textFrame = driver.findElement(By.xpath("//*[@id='Blog1']/div[1]/div/h2/span"));

		String textData1 = textFrame.getText();

		System.out.println(textData1);
		
		driver.switchTo().defaultContent();
	
		driver.switchTo().frame("iframe_a");

		driver.findElement(By.xpath("//input[@name='Town']")).sendKeys(textData1);

		WebElement textDataMainFrame = driver.findElement(By.xpath("//*[@id='Blog1']/div[1]/div/h2/span"));

		String textData2 = textDataMainFrame.getText();
		
		System.out.println(textData1);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("iframe_b");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(textData2);
	
		System.out.println("Done");
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
