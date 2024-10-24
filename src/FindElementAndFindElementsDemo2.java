import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementAndFindElementsDemo2
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		List<WebElement> list =	driver.findElements(By.xpath("//input[@type='RBG']"));
		
		int data = list.size();
		
		System.out.println("data :"+ data);

		System.out.println("Done");
		driver.quit();

	}
}
