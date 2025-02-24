package SwitchTo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FrameExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
		ChromeOptions obj=new ChromeOptions();
		obj.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(obj);
		driver.get("https://www.londonfreelance.org/courses/frames/index.html");
		driver.switchTo().frame("content");
		WebElement Header=driver.findElement(By.tagName("h1"));
		System.out.println(Header.getText());
		driver.switchTo().defaultContent();
		WebElement frame=driver.findElement(By.xpath("//frame[@name='navbar']"));
		driver.switchTo().frame(frame);
		WebElement Noframe=driver.findElement(By.xpath("//a[text()='No frames']"));
		System.out.println(Noframe.getText());
	}

}
