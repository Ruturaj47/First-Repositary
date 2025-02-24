package WebElementExample;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ToolTipExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
		ChromeOptions obj=new ChromeOptions();
		obj.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(obj);
		driver.get("https://demoqa.com/tool-tips");
		Actions abc=new Actions(driver);
		abc.clickAndHold(driver.findElement(By.id("toolTipButton")));
		abc.perform();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.className("tooltip-inner")).getText());
		
	}

}
