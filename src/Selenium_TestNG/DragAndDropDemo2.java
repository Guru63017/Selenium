package Selenium_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDropDemo2
{

	@Test
	public void dragAndDrop()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chrome 109\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/slider/");
		
		driver.switchTo().frame(0);

		WebElement slider = driver.findElement(By.xpath("//*[@id='slider']"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDropBy(slider, 10, 0).perform();
		
		System.out.println("Done");
		
		driver.quit();
	}


}
