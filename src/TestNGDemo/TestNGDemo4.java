package TestNGDemo;

import org.testng.annotations.Test;

public class TestNGDemo4 
{
	
	@Test(priority = 1)
	public void loginTest()
	{
		System.out.println("loginTest of TestNGDemo4");
		System.out.println(0/0);
	}
	
	@Test(priority = 2)
	public void customerDetails()
	{
		System.out.println("customerDetails of TestNGDemo4");
	}
}
