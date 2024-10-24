import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo2
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chrome 109\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.calculator.net/mortgage-calculator.html");

		WebElement checkBox = driver.findElement(By.xpath("//*[@id='content']/div[4]/div/form/table/tbody/tr[6]/td/label/span"));

		boolean checkBoxisDisplay = checkBox.isDisplayed();

		if(checkBoxisDisplay==true)
		{
			System.out.println("checkBox is Display");
		}
		else
		{
			System.out.println("checkBox is not Display");
		}

		boolean checkBoxisEnabled = checkBox.isEnabled();

		if(checkBoxisEnabled==true)
		{
			System.out.println("checkBox is Enabled");
		}
		else
		{
			System.out.println("checkBox is not Enabled");
		}

		boolean checkBoxisSelectedBeforeClick = checkBox.isSelected();

		if(checkBoxisSelectedBeforeClick==true)
		{
			System.out.println("checkBox is Selected Before Click");
		}
		else
		{
			System.out.println("checkBox is not Selected Before Click");
		}

		checkBox.click();
		
		WebElement checkBoxAfterSelect = driver.findElement(By.xpath("//*[@id='content']/div[4]/div/form/table/tbody/tr[6]/td/label/span"));
		
		boolean checkBoxisSelectedAfterClick = checkBoxAfterSelect.isSelected();

		if(checkBoxisSelectedAfterClick==true)
		{
			System.out.println("checkBox is Selected After Click");
		}
		else
		{
			System.out.println("checkBox is not Selected After Click");
		}
		driver.quit();
		System.out.println("Done");
		
	}
}
