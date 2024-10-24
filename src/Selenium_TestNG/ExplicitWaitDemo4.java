package Selenium_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWaitDemo4 
{
	@Test
	public void ExplicitWait() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chrome 109\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
		
		driver.findElement(By.xpath("//*[@id='ContentHolder_lbFeatures_TG_D']")).click();		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ContentHolder_lbModels_10_D']")));
		
		driver.findElement(By.xpath("//*[@id='ContentHolder_lbModels_10_D']")).click();
								
		driver.findElement(By.xpath("//span[@id='ContentHolder_lbFeatures_Bluetooth_D']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='ContentHolder_lbModels_11_D']")));
		
		driver.findElement(By.xpath("//span[@id='ContentHolder_lbModels_11_D']")).click();
		
		driver.quit();
		
	}

}
