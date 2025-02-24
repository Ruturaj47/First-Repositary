package Collection;

import java.util.ArrayList;

public class collectioninterfacemethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Object> obj=new ArrayList<Object>();
		//This will add string object
		obj.add("This is String");
		obj.add(2); //This will add integer object
		
		System.out.println(obj);
		
		ArrayList<Object> obj1=new ArrayList<Object>();
		obj1.add("New Collection");
		System.out.println(obj1);
		
		//this method is used to add one collection in another collection
		obj.addAll(obj1);
		System.out.println("After adding obj1 collection in obj" + obj);
		
		obj.remove(1);
		System.out.println(obj);
		
		obj.removeAll(obj1);
		System.out.println(obj);
		
		
		obj.clear();
		System.out.println(obj);
		
		obj.add(4);
		obj.add(25);
		System.out.println(obj);
		
		
		System.out.println(obj.contains(30));
		 

		System.out.println(obj.get(0));
		obj.set(0, 24);
		System.out.println(obj);
	}

}
