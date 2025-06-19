package testngclasses;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class LoginTest {

	@Test(description="verify that user is able to login with valid credentials",priority = 2,groups = {"smoke","sanity","regression"})
	public void TC1() {
		System.out.println("I am first test case");
	}
	
	@Test(enabled = true,description="verify that system should not allow to login with invalid credentials",groups = {"sanity"})
	public void TC2() {
		System.out.println("I am second test case");
	}
	
	@Test(priority = 1,groups = {"regression"})
	public void TC3() {
		System.out.println("I am third test case");
		Reporter.log("I am login information");
	}
}
