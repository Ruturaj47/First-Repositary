package Orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {

	WebDriver driver;
	
	public Loginpage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public WebElement getUsernametxt() {
		return driver.findElement(By.xpath(".//input[@placeholder='Username']"));
		
	}
	
	public WebElement getPasswordtxt() {
		return driver.findElement(By.xpath(".//input[@placeholder='Password']"));
	}
	
	public WebElement getLoginBtn() {
		return driver.findElement(By.tagName(".//button"));
	}
	
	public WebElement getinvalidmessageLabel() {
		return driver.findElement(By.xpath("//p[text()='Invalid credentials']"));
	}
}
