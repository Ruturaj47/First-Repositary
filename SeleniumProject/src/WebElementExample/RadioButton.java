package WebElementExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RadioButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
		ChromeOptions obj=new ChromeOptions();
		obj.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(obj);
		driver.get("https://demoqa.com/radio-button");
		WebElement YesButoon=driver.findElement(By.xpath("//label[@for='yesRadio']"));
		YesButoon.click();
		WebElement NoButton=driver.findElement(By.xpath("//input[@id='noRadio']"));
		System.out.println(NoButton.isEnabled());
		if (!NoButton.isEnabled()) {
			System.out.println("Radio Button is disable--Test case pass");
		}else {
			System.out.println("Radio Button is Enable--Test case fail");
		}
	}

}
