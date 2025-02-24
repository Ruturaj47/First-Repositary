package WebElementExample;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
		ChromeOptions obj=new ChromeOptions();
		obj.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(obj);
		driver.get("https://demoqa.com/select-menu");
		WebElement Dropdown=driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
		Select obj1=new Select(Dropdown);
		obj1.selectByIndex(3);
		List<WebElement> option=obj1.getOptions();
		Iterator<WebElement> test=option.iterator();
		while (test.hasNext()) {
			System.out.println(test.next().getText());
		}
		
		System.out.println(obj1.getFirstSelectedOption());
		
		if (obj1.getFirstSelectedOption().getText().equalsIgnoreCase("red")) {
			System.out.println("Test case is Pass");
		} else {
			System.out.println("Test case is Fail");

		}
	}
	

}
