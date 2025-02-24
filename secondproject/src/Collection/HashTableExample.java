package Collection;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTableExample {

	public static void main(String[] args) {

		Hashtable<String, Object> obj=new Hashtable<String, Object>();
		obj.put("One", null);
		
		HashMap<String, Object> obj1=new HashMap<String, Object>();
		obj1.put("One", null);
		System.out.println(obj1);
	}

}
