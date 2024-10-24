package TestNGDemo;

import org.testng.annotations.Test;

public class TestNGDemo4A 
{
	
	@Test(priority = 1)
	public void loginTest()
	{
		System.out.println("loginTest");
		System.out.println(0/0);
	}
	
	@Test(priority = 2, dependsOnMethods = "loginTest")
	public void customerDetails()
	{
		System.out.println("customerDetails");
	}
}
