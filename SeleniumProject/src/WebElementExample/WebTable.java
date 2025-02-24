package WebElementExample;


import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
		ChromeOptions obj=new ChromeOptions();
		obj.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(obj);
		driver.get("https://demoqa.com/webtables");
		List<WebElement> Column=driver.findElements(By.xpath("//div[@class='rt-th rt-resizable-header -cursor-pointer']"));
		System.out.println(Column.size());
		Iterator<WebElement> itr=Column.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next().getText());
		}
		System.out.println("Print the Rows");
		List<WebElement> Rows=driver.findElements(By.xpath("//div[@class='rt-tr-group']"));
		System.out.println(Rows.size());
		Iterator<WebElement> row=Rows.iterator();
		while (row.hasNext()) {
			System.out.println(row.next().getText());
		}
		
		WebElement search=driver.findElement(By.xpath("//div[text()='Gentry']"));
		System.out.println(search.isDisplayed());
		if (search.isDisplayed()) {
			WebElement Edit=driver.findElement(By.xpath("//span[@id='edit-record-1']"));
			Edit.click();
			System.out.println("Test Case is Passed");
		}else {
			System.out.println("Test case is failed");
		}
		
	}

}
