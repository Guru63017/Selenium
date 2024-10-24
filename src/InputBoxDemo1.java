import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputBoxDemo1
{

	public static void main(String[] args) throws InterruptedException 
	{
//		System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chrome 109\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com/");

		WebElement inputBox = driver.findElement(By.xpath("//*[@id='identifierId']"));

		boolean inputBoxisDisply = inputBox.isDisplayed();

		if(inputBoxisDisply==true)
		{
			System.out.println("inputBox is Disply");
		}
		else
		{
			System.out.println("inputBox is not Disply");
		}

		boolean inputBoxisEnable = inputBox.isEnabled();

		if(inputBoxisEnable==true)
		{
			System.out.println("inputBox is Enable");
		}
		else
		{
			System.out.println("inputBox is not enable");
		}

		String expectedwatermark = "Email or phone";

		String actualwatermark = inputBox.getAttribute("aria-label");

		if(actualwatermark.equals(expectedwatermark))

		{
			System.out.println("watermark is dislying correctly");
		}
		else
		{
			System.out.println("watermark is not displying correctly");
		}

		inputBox.sendKeys("Guru Technologies");
		String actualInputData =  inputBox.getAttribute("value");

		if(actualInputData.equals("RBG Technologies"))
		{
			System.out.println("actualEnteredData is correct");
		}
		else
		{
			System.out.println("actualEnteredData is not corret");
		}
		inputBox.clear();
		Thread.sleep(5000);
		driver.quit();

	}

}