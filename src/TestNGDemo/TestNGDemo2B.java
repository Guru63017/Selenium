package TestNGDemo;

import org.testng.annotations.Test;

public class TestNGDemo2B 
{
	
	@Test (priority = 4)
	public void funA()
	{
		System.out.println("funA of TestNGDemo2B");
	}
	
	@Test(priority = 3)
	public void funB()
	{
		System.out.println("funB of TestNGDemo2B");
	}
	
	@Test(priority = 1)
	public void funC()
	{
		System.out.println("funC of TestNGDemo2B");
	}
	
	@Test(priority = 2)
	public void funD()
	{
		System.out.println("funD of TestNGDemo2B");
	}

}
