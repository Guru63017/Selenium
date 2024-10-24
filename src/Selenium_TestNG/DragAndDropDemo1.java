package Selenium_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDropDemo1 
{
	@Test
	public void dragAndDrop()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chrome 109\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		
//		WebElement Element = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
//		driver.switchTo().frame(Element);

		WebElement drag = driver.findElement(By.xpath("//*[@id='draggable']"));

		WebElement drop = drag.findElement(By.xpath("//*[@id='droppable']"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(drag, drop).perform();
		
		System.out.println("Done");
		
		driver.quit();
	}
}
