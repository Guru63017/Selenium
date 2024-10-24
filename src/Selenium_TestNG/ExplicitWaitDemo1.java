package Selenium_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExplicitWaitDemo1 
{
	@Test
	public void ExplicitWait()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chrome 109\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
		
		WebElement threeGCheckBx = driver.findElement(By.xpath("//*[@id='ContentHolder_lbFeatures_TG_D']"));
		
		threeGCheckBx.click();
		
		WebElement model = driver.findElement(By.xpath("//*[@id='ContentHolder_lbModels_10_D']"));
		
		model.click();
		
	}

}
