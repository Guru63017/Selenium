package FWDemo1;

import java.io.IOException;

public class GenericMethodsTest2
{

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		GenericMethodsDemo2 keys = new GenericMethodsDemo2();
		keys.openBrowser("browserName");
		keys.enterURL("Url");
		keys.enterUserName("xpath", "//input[@name='username']", "userName");
		keys.enterPassword("xpath", "//input[@name='password']", "Password");
		keys.clickOnElement("xpath", "//button[@type='submit']");
		Thread.sleep(3000);
		keys.passLog();
		keys.quit();		
	}

}
