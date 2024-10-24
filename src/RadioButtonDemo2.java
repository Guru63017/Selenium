import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RadioButtonDemo2
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://demo.guru99.com/test/newtours/reservation.php");

		WebElement  roundTrip =	driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		WebElement oneWay = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		WebElement econamy = driver.findElement(By.xpath("(//input[@type='radio'])[3]"));
		WebElement business = driver.findElement(By.xpath("(//input[@type='radio'])[4]"));
		WebElement firstClass = driver.findElement(By.xpath("(//input[@type='radio'])[5]"));
		
		List<WebElement> list =  new ArrayList<WebElement>();
		list.add(roundTrip);
		list.add(oneWay);
		list.add(econamy);
		list.add(business);
		list.add(firstClass);
		Actions act = new Actions(driver);
		act.moveToElement(firstClass).perform();
		WebElement data = list.get(3);
		Thread.sleep(5000);
		data.click();
		Thread.sleep(5000);		
		driver.quit();
	}
}