package Collection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesBrowserExample {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		//To read the property file we need to user properties class
		Properties obj=new Properties();
		obj.load(new FileInputStream("./config\\config.properties"));
		//.==Your workspace+current workspace
		System.out.println(obj.getProperty("Browsername"));
		//To read the key from property file we use getproperty
		
		obj.setProperty("URL", "Facebook.com");
		System.out.println(obj.getProperty("URL"));
		FileOutputStream obj1=new FileOutputStream("./config\\\\config.properties");
		obj.store(obj1, "Changing value");
		
		
		
	}

}
