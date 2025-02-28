package Orangehrmtest;

import org.openqa.selenium.By;

import com.abc.commonfunctionality.BrowserLaunch;

import Orangehrm.Dashboard;
import Orangehrm.Loginpage;

public class LoginpageTest extends BrowserLaunch{

	public static void main(String[] args) throws InterruptedException {
		
		BrowserLaunch browser=new BrowserLaunch();
		browser.chromeinitializing();
		
		LoginpageTest logintest=new LoginpageTest();
		logintest.login_Insuccesully("Admin","admin");
		logintest.login_succesully("Admin", "admin123");
	
	
	}
	
	public void login_succesully(String Username,String Password) throws InterruptedException {
		Loginpage loginpage=new Loginpage(driver);
		loginpage.getUsernametxt().sendKeys(Username);
		loginpage.getPasswordtxt().sendKeys(Password);
		loginpage.getLoginBtn().click();
		Thread.sleep(1000);
		Dashboard dashboard=new Dashboard(driver);
		if (dashboard.getDashboardLabel().isDisplayed()) {
			System.out.println("user is able to login successfully");
		}else {
			System.out.println("user is not able to login successfully");
		}
		
	}
	
	public void login_Insuccesully(String Username,String Password) throws InterruptedException {
		Loginpage loginpage=new Loginpage(driver);
		loginpage.getUsernametxt().sendKeys(Username);
		loginpage.getPasswordtxt().sendKeys(Password);
		loginpage.getLoginBtn().click();
		Thread.sleep(1000);
		if (loginpage.getinvalidmessageLabel().isDisplayed()) {
			System.out.println("user is not able to login with invalid credentials");
		}else {
			System.out.println("user is able to login with invalid credentials");
		}

	}
}