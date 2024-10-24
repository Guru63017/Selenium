package TestNGDemo;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionDemo1 
{
	@Test
	void funA()
	{
		System.out.println("funA of SoftAssertionDemo1");
		
		SoftAssert sAssert = new SoftAssert();
		
		sAssert.assertEquals("RBG", "RBG");
		System.out.println("testCase 1 is completed");
		
		sAssert.assertEquals("RBG", "selenium");
		System.out.println("testCase 2 is completed");
		
		sAssert.assertAll();  //it should mandotary
		
		System.out.println("Done");
		
	}	

}
