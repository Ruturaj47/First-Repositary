package WebElementExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MenuExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
		ChromeOptions obj=new ChromeOptions();
		obj.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(obj);
		driver.get("https://demoqa.com/menu");
		Actions abc=new Actions(driver);
		abc.clickAndHold(driver.findElement(By.xpath("//a[text()='Main Item 2']")));
		abc.perform();
		Thread.sleep(500);
		abc.clickAndHold(driver.findElement(By.xpath("//a[text()='SUB SUB LIST »']")));
		abc.perform();
		Thread.sleep(500);
		abc.click(driver.findElement(By.xpath("//a[text()='Sub Sub Item 1']")));
		
		
		
	}

}
