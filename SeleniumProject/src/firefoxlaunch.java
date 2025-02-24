import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxlaunch {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","Resources/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("https://www.myntra.com");
		driver.manage().window().fullscreen();
		//driver.close();
		System.out.println(driver.getTitle());
	}

}
