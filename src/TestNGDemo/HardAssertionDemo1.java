package TestNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionDemo1 
{
	@Test
	public void funA()
	{
		System.out.println("funA start");
		String expectedData = "RBG Technologies";
		String actualData = "RBG Technologies";
		Assert.assertEquals(expectedData,actualData);
		System.out.println("funA Done");

	}
	@Test
	public void funB()
	{
		System.out.println("funB start");
		String expectedData = "RBG Technologies";
		String actualData = "Selenium";
		Assert.assertEquals(expectedData,actualData);
		System.out.println("funB Done");

	}
	@Test
	public void funC()
	{
		System.out.println("funC start");
		String expectedData = "RBG Technologies";
		String actualData = "Selenium";
		Assert.assertNotEquals(actualData, expectedData);
		System.out.println("funC Done");

	}
	@Test
	public void funD()
	{
		System.out.println("funD start");
		String expectedData = "RBG Technologies";
		String actualData = "RBG Technologies";
		Assert.assertNotEquals(actualData, expectedData);
		System.out.println("funD Done");

	}

	public void funE()
	{
		System.out.println("funE Start");
		Assert.assertTrue(true);
		System.out.println("funE Done");


	}
	public void funF()
	{
		System.out.println("funF Start");
		Assert.assertFalse(false);
		System.out.println("funF Done");

	}
	public void funG()
	{
		System.out.println("funG Start");
		Assert.assertFalse(true);
		System.out.println("funG Done");

	}
	public void funH()
	{
		System.out.println("funH Start");
		Assert.assertTrue(true);
		System.out.println("funH Done");


	}
}