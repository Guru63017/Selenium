package TestNGDemo;

import org.testng.annotations.Test;

public class TestNGDemo1 
{
	public static void main(String[] args) 
	{
		System.out.println("main method of TestNGDemo1");
	}
	
	@Test
	public void funA()
	{
		System.out.println("funA of TestNGDemo1");
	}

}
