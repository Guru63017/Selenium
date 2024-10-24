import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonDemo2
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chrome 109\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/button/");
		
		driver.switchTo().frame(0);
		
		WebElement button = driver.findElement(By.xpath("/html/body/input"));

		boolean buttonisDisplay = button.isDisplayed();
		 
		if(buttonisDisplay == true)
		{
			System.out.println("button is Display");
		}
		else
		{
			System.out.println("button is not Display");
		}
		
		boolean buttonisEnable = button.isEnabled();
		 
		if(buttonisEnable == true)
		{
			System.out.println("button is Enabled");
		}
		else
		{
			System.out.println("button is not Enabled");
		}
		
		String expectedButtonName = "A submit button";
		
		String actualButtonName = button.getAttribute("value");
				
		if(actualButtonName.equals(expectedButtonName))
		{
			System.out.println("expected ButtonName is correct");
		}
		else
		{
			System.out.println("expected ButtonName is not correct");
		}
		Thread.sleep(5000);
		
		button.click();			
				
		Thread.sleep(5000);

		driver.quit();
	}
}
