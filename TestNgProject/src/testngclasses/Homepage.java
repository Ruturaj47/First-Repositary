package testngclasses;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Homepage {

	
	@BeforeMethod 
	public void m1() { 
		System.out.println("I am from homepage m1");
	}
	 
	
	@Test
	public void m2() {
		System.out.println("I am from homepage m2");
	}
	
	
	@AfterMethod 
	public void m3() { 
		System.out.println("I am from homepage m3");
	 }
	 
}
