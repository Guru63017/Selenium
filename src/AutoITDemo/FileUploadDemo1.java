package AutoITDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUploadDemo1
{
	@Test
	public void FileUpload()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chrome 109\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("file:///C:/Users/malli/Downloads/FileUploadDemo1%20(1).html");
		
		driver.findElement(By.xpath("//input[@id='RBG']")).sendKeys("C:\\Users\\malli\\Desktop\\demo2.JPG");
		
		System.out.println("Done");
	}

}
