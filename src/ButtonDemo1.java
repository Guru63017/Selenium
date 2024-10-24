import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonDemo1
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chrome 109\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		WebElement loginButton = driver.findElement(By.xpath("//button[@name='login']"));

		boolean loginisDisplay = loginButton.isDisplayed();

		if(loginisDisplay==true)
		{
			System.out.println("login is Display");
		}
		else
		{
			System.out.println("login is not Display");
		}

		boolean loginisEnable = loginButton.isEnabled();

		if(loginisEnable==true)
		{
			System.out.println("login is Enable");
		}
		else
		{
			System.out.println("login is not Enable");
		}

		String expectedLoginName = "Log In";

		String actualLoginName = loginButton.getText();

		if(actualLoginName.equals(expectedLoginName))
		{
			System.out.println("actualLoginName is correct");
		}
		else
		{
			System.out.println("actualLoginName is not correct");
		}

		Thread.sleep(5000);

		loginButton.click();

		Thread.sleep(5000);

		driver.quit();
	}
}
