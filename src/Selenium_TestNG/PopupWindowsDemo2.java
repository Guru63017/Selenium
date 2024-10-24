package Selenium_TestNG;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupWindowsDemo2 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chrome 109\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://uat.cap.org/");

		WebElement shop = driver.findElement(By.xpath("(//a[@href='https://estoreuat.cap.org/OA_HTML/xxCAPibeCZzpHome.jsp?sitex=10020%3A22372%3AUS&ref=xxCAPibeCZzpHome.jsp'])[1]"));

		shop.click();

		Set<String> windowsSet =  driver.getWindowHandles();

		Iterator<String> windowsList = windowsSet.iterator();

		String requiredWindowTittle = "windows Tittle";

		System.out.println(requiredWindowTittle);

		for(int i =0; i<windowsSet.size(); i++)
		{
			driver.switchTo().window(windowsList.next());
			if(driver.getTitle().equals(requiredWindowTittle))
			{
				System.out.println("windows name matched");
				break;
			}
		}

	}

}
