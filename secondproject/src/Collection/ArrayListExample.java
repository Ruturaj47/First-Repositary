package Collection;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		int a[]=new int[4];
		a[0]=1; 
		//a[1]="str";  //Array only support homogeneous datatype
		//int b=4;
		ArrayList<Object> obj=new ArrayList<Object>();
		obj.add("String");  //we added a string
		obj.add(7);  //we added int wrapper classes int---integer
		//whether compiler throw any error-no
		//because collection support heterogeneous object
		//collection is nothing but a group of object
		obj.add(45);
		obj.add(2, 457);
		
		System.out.println(obj.get(0));
		System.out.println(obj.get(1));
		System.out.println(obj);
		
	}

}
