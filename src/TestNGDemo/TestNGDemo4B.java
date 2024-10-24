package TestNGDemo;

import org.testng.annotations.Test;

public class TestNGDemo4B 
{
	
	@Test(priority = 1)
	public void loginTest()
	{
		System.out.println("loginTest");
//		System.out.println(0/0);
	}
	
	@Test(priority = 2,dependsOnMethods = "loginTest")
	public void otpVerification()
	{
		System.out.println("otp Verification");
		System.out.println(0/0);
	}
	
	@Test(priority = 3, dependsOnMethods = {"loginTest","otpVerification"})
	public void customerDetails()
	{
		System.out.println("customerDetails");
	}
}
