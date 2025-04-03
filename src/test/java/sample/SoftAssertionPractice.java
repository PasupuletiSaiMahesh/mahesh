package sample;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionPractice 
{
	@Test
	 public void strictLevelCompartion()
	 {
		String expectedName="Man";
		String actualName="boy";
		
		SoftAssert a=new SoftAssert();
		a.assertEquals(expectedName, actualName);
		System.out.println("Soft Assert Strict level Complete");
		a.assertTrue(actualName.equals(expectedName));
		a.assertAll();
		System.out.println("After Assert all");
		 
	 }
	@Test
	public void containsLevelCompartion()
	{
		String a1="bat";
		String a2="bat";
		
		SoftAssert s = new SoftAssert();
		s.assertTrue(a1.equals(a2));
		s.assertAll();
		System.out.println("Soft Assert Contains level Complete");
		
	}
	

}
