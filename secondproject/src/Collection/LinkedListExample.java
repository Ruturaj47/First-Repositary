package Collection;

import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[]args) {
		
		LinkedList<Object> obj=new LinkedList<Object>();
		obj.addFirst("First String");
		obj.add("Testing");
		obj.addLast("Last index");
		obj.addFirst("Second String");
		System.out.println(obj);
		
		
		System.out.println(obj.getLast());
	}

}
