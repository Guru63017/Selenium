import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chrome 109\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com/");
//		driver.findElement(By.id("identifierId")).sendKeys("Rbg");
//		driver.findElement(By.name("identifier")).sendKeys("Rbg1");
//		driver.findElement(By.className("whsOnd")).sendKeys("Rbg3");
//		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/c-wiz/div/div[2]/div/div/div[1]/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input")).sendKeys("Rbg4");
//		Thread.sleep(3000);
		driver.quit();
	}

}