import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InpuBox1
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chrome 109\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement userNameInputBox =  driver.findElement(By.xpath("//*[@id='email']"));
		boolean inputBoxIsDisply = userNameInputBox.isDisplayed();
		if(inputBoxIsDisply==true)
		{
			System.out.println("input Box Is Disply");
		}
		else
		{
			System.out.println("input Box Is not Disply");
		}
		boolean inputBoxIsEnable = userNameInputBox.isEnabled();
		if(inputBoxIsEnable==true)
		{
			System.out.println("inputBox Is Enable");
		}
		else
		{
			System.out.println("inputBox Is not Enable");
		}
		String expectedWaterMark = "Email address or phone number" ;
		String actualWaterMark = userNameInputBox.getAttribute("placeholder");
		if(actualWaterMark.equals(expectedWaterMark))

		{
			System.out.println("watermark is dislying correctly");
		}
		else
		{
			System.out.println("watermark is not displying correctly");
		}
		userNameInputBox.sendKeys("Hello");
		String actualData = userNameInputBox.getAttribute("value");
		if (actualData.equals("Hello"))
		{
			System.out.println("enter data is correct");
		}
		else 
		{
			System.out.println("enter data is not correct");	
		}
		Thread.sleep(5000);
		driver.quit();
	}
}
