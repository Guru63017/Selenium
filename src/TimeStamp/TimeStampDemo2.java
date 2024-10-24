package TimeStamp;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TimeStampDemo2 
{
	public static WebDriver driver;
	public static void main(String[] args) throws IOException 
	{
		passLog();
	}
	public static void passLog() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chrome 109\\chromedriver.exe");
		driver = new ChromeDriver();
		String path = System.getProperty("user.dir");
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("hhmmssddMMYYYY");
		String format = dateFormat.format(date);
		//		System.out.println("format  : "+format);
		TakesScreenshot screenShot = (TakesScreenshot)driver;
		File source = screenShot.getScreenshotAs(OutputType.FILE);
		//		System.out.println("path  :  "+path);
		File target = new File(path+"\\ScreenShots\\"+format+".png");
		FileUtils.copyFile(source, target);
		System.out.println("Done");
	}

}
