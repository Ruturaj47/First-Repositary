package SwitchTo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alertentermessage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
		ChromeOptions obj=new ChromeOptions();
		obj.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(obj);
		driver.get("https://demoqa.com/alerts");
		WebElement ClickButton=driver.findElement(By.xpath("//button[@id='promtButton']"));
		ClickButton.click();
		//we have to click on ok button of pop up window
		//step1==we have to move to alert
		Alert abc=driver.switchTo().alert();
		Thread.sleep(5000);
		//step2==call accept method if you want to click on ok
		//call dismiss method if you want to click on cancel
		abc.sendKeys("Ruturaj");
		abc.accept();
	}

}
