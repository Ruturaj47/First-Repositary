package WebElementExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CheckBoxExample {

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
			ChromeOptions obj=new ChromeOptions();
			obj.addArguments("--remote-allow-origins=*");
			ChromeDriver driver=new ChromeDriver(obj);//driver is the reference of chromedriver
			driver.get("https://demoqa.com/checkbox");
			WebElement Home=driver.findElement(By.xpath("//label[@for='tree-node-home']/span"));
			if (!Home.isSelected()) {
			
			}
			Home.click();
			WebElement Result=driver.findElement(By.xpath("//div[@id='result']"));
			if (Result.isDisplayed()) {
				System.out.println(Result.getText());

			}
	}

}
