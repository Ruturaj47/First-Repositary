package SwitchTo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
		ChromeOptions obj=new ChromeOptions();
		obj.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(obj);
		driver.get("https://demoqa.com/browser-windows");
		//whenever window open internally operating system assigns key/id to each window
		//To know the unique key of window we have one method called as getwindowhandle
		String ParentWindow=(driver.getWindowHandle());
		System.out.println("This is my first window id "+ParentWindow);
		WebElement newtab=driver.findElement(By.xpath("//button[@id='tabButton']"));
		newtab.click();
		Set<String> abc=driver.getWindowHandles();
		System.out.println(abc.size());
		Iterator<String> itr=abc.iterator();
		while (itr.hasNext()) {
			String str=itr.next().toString();
			if (str.equalsIgnoreCase(ParentWindow)) {
				System.out.println("We both represent same window");
			}else {
				System.out.println("We both represent different window");
				driver.switchTo().window(str);
				WebElement Heading=driver.findElement(By.tagName("h1"));
				System.out.println(Heading.getText());
			}
		}
	}

}
