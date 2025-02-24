package WebElementExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebElementOperation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
		ChromeOptions obj=new ChromeOptions();
		obj.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(obj);//driver is the reference of chromedriver
		driver.get("https://demoqa.com/text-box");
		//driver.manage().window().fullscreen();
		System.out.println(driver.getTitle());
		//find the address perform the operation
		//enter the value in full name field
		//address of elements is called locator
		//different way of finding the locator called as strategy
		WebElement Fullname=driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
		//to enter the value in element we use sandkeys method from webelement interface
		Fullname.sendKeys("Ruturaj");
		//to enter the value in email
		//find the element --FindElement
		WebElement Email=driver.findElement(By.cssSelector("input[placeholder='name@example.com']"));
		Email.sendKeys("abc@gmail.com");
		Fullname.clear();//It will clear the ruturaj word which we enter at line 24
		Fullname.sendKeys("Ahire");
		WebElement Submit=driver.findElement(By.id("submit"));
		Submit.click();
	}

}
