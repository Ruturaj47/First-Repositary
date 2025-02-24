package WebElementExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Tab {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
		ChromeOptions obj=new ChromeOptions();
		obj.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(obj);
		driver.get("https://demoqa.com/tabs");
		WebElement Origin=driver.findElement(By.xpath("//a[@id='demo-tab-origin']"));
		Origin.click();
		WebElement Tab=driver.findElement(By.id("demo-tabpane-origin"));
		System.out.println(Tab.getText());
	}

}
