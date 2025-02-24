package Collection;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationExample {

	public static void main(String[] args) {

		Vector<Object> obj=new Vector<Object>();
		obj.add("String");
		obj.add(1, "second string");
		obj.addElement("Third string");
		
		Enumeration<Object> enumration=obj.elements();
		
		//Enumeration is holding total three object
		while(enumration.hasMoreElements()) {
			System.out.println(enumration.nextElement());
		}
		
	}

}
