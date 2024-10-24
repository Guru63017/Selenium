package Selenium_TestNG;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TittleDemo3 
{
	@Test
	public void Tittle()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chrome 109\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

		String mainWindow = driver.getTitle();

		System.out.println(mainWindow);

		WebElement multiWindows = driver.findElement(By.xpath("//*[@id='newWindowsBtn']"));

		multiWindows.click();

		Set<String> popupPage2 = driver.getWindowHandles();

		Iterator<String> switchpage = popupPage2.iterator();

		String parentWindow = switchpage.next();

		String childWindow = switchpage.next();

		String cc = switchpage.next();

		driver.switchTo().window(childWindow);

		String window2 = driver.getTitle();

		System.out.println(window2);

		WebElement text = driver.findElement(By.xpath("//*[@id='Blog1']/div[1]/div/div[1]/div[1]/div/h1"));

		String textData =  text.getText();

		System.out.println(textData);

		System.out.println("Done");


	}

}
