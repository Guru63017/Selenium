package AutoITDemo;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUploadDemo3
{
	@Test
	public void FileUpload() throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chrome 109\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

//		driver.manage().window().maximize();

		driver.get("file:///C:/Users/malli/Downloads/FileUploadDemo1%20(1).html");
		
//		driver.findElement(By.xpath("//input[@id='RBG']")).click();
		
		Thread.sleep(10000);
		
		Runtime.getRuntime().exec("C:\\Users\\malli\\Desktop\\AutoIT\\AutoITDemo1.exe");
		
		System.out.println("Done");
	}

}
