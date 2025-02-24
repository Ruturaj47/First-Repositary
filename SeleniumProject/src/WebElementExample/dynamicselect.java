package WebElementExample;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class dynamicselect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
		ChromeOptions obj=new ChromeOptions();
		obj.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(obj);
		driver.get("https://demoqa.com/select-menu");
		driver.findElement(By.xpath("//div[@id='withOptGroup']//div[contains(@class,'-indicatorContainer')]"));
		Thread.sleep(1000);
		driver.findElement(By.id("react-select-2-option-0-0")).click();
	}

}
