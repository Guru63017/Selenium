package FWDemo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericMethodsDemo1
{
	public WebDriver driver;
	
	public void openBrowser(String browserName)
	{
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chrome 109\\chromedriver.exe");
			driver = new ChromeDriver();					
			driver.manage().window().maximize();
		}

		else if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\GuruOnlineClass\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();

		}

		else if(browserName.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver", "D:\\GuruOnlineClass\\Selenium\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.manage().window().maximize();
		}
	}
	

	public void enterURL(String url)
	{
		driver.get(url);
	}

	public void enterData(String locatorType ,String locatorValue,String data)
	{
		if(locatorType.equals("name"))
		{
			driver.findElement(By.name(locatorValue)).sendKeys(data);
		}
		else if(locatorType.equals("id"))
		{
			driver.findElement(By.id(locatorValue)).sendKeys(data);;
		}
		else if(locatorType.equals("className"))
		{
			driver.findElement(By.className(locatorValue)).sendKeys(data);
		}
		else if(locatorType.equals("xpath"))
		{
			driver.findElement(By.xpath(locatorValue)).sendKeys(data);
		}
		else if(locatorType.equals("tagName"))
		{
			driver.findElement(By.tagName(locatorValue)).sendKeys(data);
		}
		else if(locatorType.equals("cssSelector"))
		{
			driver.findElement(By.cssSelector(locatorValue)).sendKeys(data);
		}
		else if(locatorType.equals("linkText"))
		{
			driver.findElement(By.linkText(locatorValue)).sendKeys(data);
		}
		else if(locatorType.equals("partialLinkText"))
		{
			driver.findElement(By.partialLinkText(locatorValue)).sendKeys(data);
		}
	}

	public void clickOnElement(String locatorType,String value)
	{


		if(locatorType.equals("name"))
		{
			driver.findElement(By.name(value)).click();
		}
		else if(locatorType.equals("id"))
		{
			driver.findElement(By.id(value)).click();
		}
		else if(locatorType.equals("className"))
		{
			driver.findElement(By.className(value)).click();
		}
		else if(locatorType.equals("xpath"))
		{
			driver.findElement(By.xpath(value)).click();
		}
		else if(locatorType.equals("tagName"))
		{
			driver.findElement(By.tagName(value)).click();
		}
		else if(locatorType.equals("cssSelector"))
		{
			driver.findElement(By.cssSelector(value)).click();
		}
		else if(locatorType.equals("linkText"))
		{
			driver.findElement(By.linkText(value)).click();
		}
		else if(locatorType.equals("partialLinkText"))
		{
			driver.findElement(By.partialLinkText(value)).click();
		}

	}
}
