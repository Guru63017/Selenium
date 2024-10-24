package FWDemo1;

public class GenericMethodsTest1
{

	public static void main(String[] args) 
	{
		GenericMethodsDemo1 keys = new GenericMethodsDemo1();
		keys.openBrowser("chrome");//firefox,edge
		keys.enterURL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		keys.enterData("xpath", "//input[@name='username']", "Admin");
		keys.enterData("xpath", "//input[@name='password']", "Password");
		keys.clickOnElement("TagName", "button");

	}

}
