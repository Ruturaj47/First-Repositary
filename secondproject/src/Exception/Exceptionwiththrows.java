package Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exceptionwiththrows {

	public static void main(String[] args) throws FileNotFoundException {

		Exceptionwiththrows obj=new Exceptionwiththrows();
		obj.m1();
		obj.m2();
		
	}
	
	public void m1() {
		//We are reading file and it may throw filenotfoundexception
		//filenotfoundexception comes under the checked exception so compiler will
		try {
			FileReader test=new FileReader(new File(""));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void m2() throws FileNotFoundException {
		FileReader test=new FileReader(new File(""));

	}

}
