
package FWDemo1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class GenericMethodsDemo2
{
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest parentExtentLogger;
	public static ExtentTest childExtentLogger;

	public WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	public void openBrowser(String browserName) throws IOException
	{		
		FileInputStream fin = new FileInputStream(projectPath+"\\src\\config.properties");
		Properties prop = new Properties();
		prop.load(fin);
		String browsername   = prop.getProperty("browserName");
		if(browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chrome 109\\chromedriver.exe");
			driver = new ChromeDriver();					
			driver.manage().window().maximize();
		}

		else if(browsername.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\GuruOnlineClass\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();

		}

		else if(browsername.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver", "D:\\GuruOnlineClass\\Selenium\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.manage().window().maximize();
		}
	}


	public void enterURL(String url) throws IOException
	{
		FileInputStream fin = new FileInputStream(projectPath+"\\src\\config.properties");
		Properties prop = new Properties();
		prop.load(fin);
		String Url   = prop.getProperty("Url");
		driver.get(Url);
	}

	public void enterUserName(String locatorType ,String locatorValue,String data) throws IOException
	{
		FileInputStream fin = new FileInputStream(projectPath+"\\src\\config.properties");
		Properties prop = new Properties();
		prop.load(fin);
		String useName   = prop.getProperty("userName");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		if(locatorType.equals("name"))
		{
			driver.findElement(By.name(locatorValue)).sendKeys(useName);
		}
		else if(locatorType.equals("id"))
		{
			driver.findElement(By.id(locatorValue)).sendKeys(useName);;
		}
		else if(locatorType.equals("className"))
		{
			driver.findElement(By.className(locatorValue)).sendKeys(useName);
		}
		else if(locatorType.equals("xpath"))
		{
			driver.findElement(By.xpath(locatorValue)).sendKeys(useName);
		}
		else if(locatorType.equals("tagName"))
		{
			driver.findElement(By.tagName(locatorValue)).sendKeys(useName);
		}
		else if(locatorType.equals("cssSelector"))
		{
			driver.findElement(By.cssSelector(locatorValue)).sendKeys(useName);
		}
		else if(locatorType.equals("linkText"))
		{
			driver.findElement(By.linkText(locatorValue)).sendKeys(useName);
		}
		else if(locatorType.equals("partialLinkText"))
		{
			driver.findElement(By.partialLinkText(locatorValue)).sendKeys(useName);
		}
	}
	public void enterPassword(String locatorType ,String locatorValue,String data) throws IOException
	{
		FileInputStream fin = new FileInputStream(projectPath+"\\src\\config.properties");
		Properties prop = new Properties();
		prop.load(fin);
		String password   = prop.getProperty("password");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		if(locatorType.equals("name"))
		{
			driver.findElement(By.name(locatorValue)).sendKeys(password);
		}
		else if(locatorType.equals("id"))
		{
			driver.findElement(By.id(locatorValue)).sendKeys(password);;
		}
		else if(locatorType.equals("className"))
		{
			driver.findElement(By.className(locatorValue)).sendKeys(password);
		}
		else if(locatorType.equals("xpath"))
		{
			driver.findElement(By.xpath(locatorValue)).sendKeys(password);
		}
		else if(locatorType.equals("tagName"))
		{
			driver.findElement(By.tagName(locatorValue)).sendKeys(password);
		}
		else if(locatorType.equals("cssSelector"))
		{
			driver.findElement(By.cssSelector(locatorValue)).sendKeys(password);
		}
		else if(locatorType.equals("linkText"))
		{
			driver.findElement(By.linkText(locatorValue)).sendKeys(password);
		}
		else if(locatorType.equals("partialLinkText"))
		{
			driver.findElement(By.partialLinkText(locatorValue)).sendKeys(password);
		}
	}

	public void clickOnElement(String locatorType,String value)
	{

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
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
	public void passLog() throws IOException
	{
		String path = System.getProperty("user.dir");
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("hhmmss");
		String format = dateFormat.format(date);
		//		System.out.println("format  : "+format);
		TakesScreenshot screenShot = (TakesScreenshot)driver;
		File source = screenShot.getScreenshotAs(OutputType.FILE);
		//		System.out.println("path  :  "+path);
		File target = new File(path+"\\ScreenShots\\"+format+".png");
		FileUtils.copyFile(source, target);
	}
	public void quit() throws InterruptedException
	{
		driver.quit();
		Thread.sleep(3000);
		System.out.println("Done");
	}
}
