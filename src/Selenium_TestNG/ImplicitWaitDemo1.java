package Selenium_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ImplicitWaitDemo1 
{

	@Test
	public void ImplicitWait() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chrome 109\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//*[@id='ContentHolder_lbFeatures_TG_D']")).click();		
		
		driver.findElement(By.xpath("//*[@id='ContentHolder_lbModels_10_D']")).click();
										
		driver.findElement(By.xpath("//span[@id='ContentHolder_lbFeatures_Bluetooth_D']")).click();
				
		driver.findElement(By.xpath("//span[@id='ContentHolder_lbModels_11_D']")).click();
		
		System.out.println("Done");
		
		driver.quit();
		
	}



}
