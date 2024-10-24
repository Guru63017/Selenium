package Selenium_TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableDemo1 
{
	@Test
	public void webTable()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chrome 109\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://only-testing-blog.blogspot.com/2013/09/test.html");

		WebElement row = driver.findElement(By.xpath("//*[@id='post-body-6522850981930750493']/div[1]/table/tbody/tr[1]/td[1]"));

		String rowData = row.getText();

		System.out.println(rowData);

		List<WebElement> allRows= driver.findElements(By.xpath("//*[@id='post-body-6522850981930750493']/div[1]/table/tbody/tr"));

		int rowcount = allRows.size();

		System.out.println(rowcount);

		List<WebElement> allcolumnsfirstRow = driver.findElements(By.xpath("//*[@id='post-body-6522850981930750493']/div[1]/table/tbody/tr[1]/td"));

		int allcolumnsfirstRowCount = allcolumnsfirstRow.size();

		System.out.println(allcolumnsfirstRowCount);

		String xpath1 = "//*[@id='post-body-6522850981930750493']/div[1]/table/tbody/tr[";

		String xpath2 = "]/td[";
		String xpath3 ="]";

		for(int i = 1; i<=rowcount; i++)
		{
			for(int j=1; j<=allcolumnsfirstRowCount; j++)
			{
				String tableData = driver.findElement(By.xpath(xpath1+i+xpath2+j+xpath3)).getText();
				System.out.println("\n"+tableData);
			}

		}

		System.out.println("Done");
		driver.quit();
	}

}
