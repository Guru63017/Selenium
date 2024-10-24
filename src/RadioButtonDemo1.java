import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonDemo1
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://demo.guru99.com/test/newtours/reservation.php");

		WebElement radioButton = driver.findElement(By.xpath("//input[@type='radio' and @value='oneway']"));

		boolean radioButtonisDisply = radioButton.isDisplayed();

		if(radioButtonisDisply==true)
		{
			System.out.println("radio is Disply");
		}
		else
		{
			System.out.println("radio is not Disply");
		}

		boolean radioButtonisEnable = radioButton.isEnabled();

		if(radioButtonisEnable==true)
		{
			System.out.println("radio is Enable");
		}
		else
		{
			System.out.println("radio is not Enable");
		}

		boolean radioButtonisSelected = radioButton.isSelected();

		if(radioButtonisSelected==false)	
		{
			System.out.println("radio is not Selected");
		}
		else
		{
			System.out.println("radio is Selected");
		}

		radioButton.click();

		boolean radioButtonisSelectedAfterclick = radioButton.isSelected();

		if(radioButtonisSelectedAfterclick==true)
		{
			System.out.println("radio is SelectedAfterclick");
		}
		else
		{
			System.out.println("radio is not SelectedAfterclick");
		}
	
		driver.quit();
	}
}