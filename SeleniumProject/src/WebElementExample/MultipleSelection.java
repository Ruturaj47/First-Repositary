package WebElementExample;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelection {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
		ChromeOptions obj=new ChromeOptions();
		obj.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(obj);
		driver.get("https://demoqa.com/select-menu");
		Select abc=new Select(driver.findElement(By.xpath("//select[@name='cars']")));
		abc.selectByIndex(2);
		abc.selectByIndex(1);
		System.out.println(abc.isMultiple());
	}

}
