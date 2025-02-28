package com.abc.commonfunctionality;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

//we are developing framework---skeleton
public class BrowserLaunch {
	
	public static WebDriver driver;
	public static Properties abc;
	
	public void chromeinitializing() {
		
		Readproperty();
		String Browsername=abc.getProperty("Browsername");
		if (Browsername.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver","D:\\Workspace\\TestMaven\\src\\main\\resources\\chromedriver.exe");
			ChromeOptions obj=new ChromeOptions();
			obj.addArguments("--remote-allow-origins=*");
			driver=new ChromeDriver(obj);
		}else {
			System.setProperty("webdriver.gecko.driver", "path");
			driver=new FirefoxDriver();
			
		}
		driver.get(abc.getProperty("url"));
		
	}
	
	public static void Readproperty() {
		try {
			abc=new Properties();
			abc.load(new FileInputStream("D:/Workspace/TestMaven/src/main/resources/config.properties"));
		} catch (FileNotFoundException e) {
			
		}catch (IOException e) {
		}
	}
}
