package Selenium_TestNG;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PopUpWindowHanleDemo1
{
	@Test
	public void labe() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chrome 109\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://www.gmail.com/");

		WebElement guestModeLink = driver.findElement(By.xpath("//*[@id='yDmH0d']/c-wiz/div/div[2]/div/div/div[2]/div/div/a"));
		
		guestModeLink.click();
		
		Set<String> popupPage2 = driver.getWindowHandles();
		
		Iterator<String> switchpage = popupPage2.iterator();
		
		String parentWindow = switchpage.next();
		
		String childWindow = switchpage.next();
		
		driver.switchTo().window(childWindow);
		
		WebElement text = driver.findElement(By.xpath("//*[@id='page-width-container']/div[1]/article/section/h1"));
	
		String textData = text.getText();
		
		System.out.println(textData);
		
		System.out.println("Done");
		
		driver.quit();
	}


}
