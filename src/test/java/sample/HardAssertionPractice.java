package sample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionPractice 
{
	@Test
	 public void StictlevelComparison() 
	 {
		String expectedName="Sai";
		String actualName="Sai";
		
		Assert.assertEquals(actualName, expectedName);
//		Assert.assertTrue(actualName.equals(expectedName));
//		Assert.assertEquals(actualName.equals(expectedName),true);
		System.out.println("Hard Asseryion strict level completed");
	 }
	
	@Test
	public void containsLevelComparsion()
	{
		String expectedName="don";
		String actualName="dom";
		
		Assert.assertTrue(actualName.contains(expectedName));
		System.out.println("Hard Asseryion contains level completed");
	}
	
	

}
