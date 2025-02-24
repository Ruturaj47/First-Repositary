import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class chromelaunch {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
		ChromeOptions obj=new ChromeOptions();
		obj.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(obj);
		driver.navigate().to("https://www.myntra.com");
		driver.manage().window().fullscreen();
		//driver.close();
		System.out.println(driver.getTitle());
		
	}

}

