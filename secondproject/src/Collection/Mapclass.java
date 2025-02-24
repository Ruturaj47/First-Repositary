package Collection;

import java.util.HashMap;

public class Mapclass {

	public static void main(String[] args) {

		//Map does't extend collection interface
		HashMap<Integer, String> obj=new HashMap<Integer, String>();
		//To add object in map we use put method while in collection it is generally add method
		obj.put(1, "One");
		obj.put(2, "Two");
	
		//Key can't be duplicate but value can be
		obj.put(2, "Three");//If you do some new value will overwrite the existing one
		System.out.println(obj);
		
		//You can have duplicate value there is no impact
		//As map delays based on key not on value
		obj.put(3, "three");
		System.out.println(obj);
		
		
		//Addall----Within collection this method is used to add one collection in another
		//Putall----It is similar to your addall---add one map in another
		
		HashMap<Integer, String> obj1=new HashMap<Integer, String>();
		obj1.putAll(obj);
	}

}
