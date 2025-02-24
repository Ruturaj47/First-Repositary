package WebElementExample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class KeyStokeExample {

	public static void main(String[] args) {
		
		//Keystoke-if you want to pass keys having text then we use sendkeys
		System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
		ChromeOptions obj=new ChromeOptions();
		obj.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(obj);
		driver.get("https://demoqa.com/text-box");
		WebElement fullname=driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
		WebElement email=driver.findElement(By.cssSelector("input[placeholder='name@example.com']"));
		WebElement submitbtn=driver.findElement(By.id("submit"));
		fullname.sendKeys("Admin");
		email.sendKeys("admin123");
		//Approach 1=whenever you want to press keys which don't have text use keys enter
		submitbtn.sendKeys(Keys.ENTER);
		
		//Approach 2
		//Actions class has two methods keyup and keydown
		Actions action=new Actions(driver);
		//fullname=Admin
		//Select the admin then press ctrl+a;
		//Actions class has two methods keyup and keydown
		//both methods can only applicable for control,shift,alt
		//these three keys are important and always use as short
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		email.click();
		action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		//Approach 3
		//we will use sendkeys to do ctrl+A , ctrl+c , and ctrl+v
		String select=Keys.chord(Keys.CONTROL,"a");
		String copy=Keys.chord(Keys.CONTROL,"c");
		String paste=Keys.chord(Keys.CONTROL,"v");
		fullname.sendKeys(select);
		email.sendKeys(copy);
		email.click();
		submitbtn.sendKeys(paste);
	}

}
