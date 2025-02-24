package Collection;

import java.util.TreeSet;

public class SortedsetExample {

	public static void main(String[] args) {

		//Sorted set is interface so we can not create object
		//but it is implemented by treeset
		//Grow of object represented as singke entity where object are store based on some sorting order
		//if you don't provide your own sorting order default is ascending
		
		TreeSet<Integer> obj=new TreeSet<Integer>();
		obj.add(2);
		obj.add(4);
		obj.add(1);
		obj.add(3);
		obj.add(2);
		System.out.println(obj);
		System.out.println(obj.first());
		System.out.println(obj.last());
		System.out.println(obj.headSet(3));
		System.out.println(obj.tailSet(3));
		System.out.println(obj.subSet(1, 4));//it will retrive the partial set based on starting and end position

	}

}
