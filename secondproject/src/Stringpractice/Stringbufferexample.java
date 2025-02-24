package Stringpractice;

public class Stringbufferexample {
	
	public static void main(String[] args) {
		
		//To get the access of string buffer we need to create object
		//object with no parameter constructor
		StringBuffer obj=new StringBuffer();
		System.out.println(obj.length());
		//abc with String as parameter constructor
		StringBuffer abc=new StringBuffer("This is for testing");
		System.out.println(abc.length());
		
		//String buffer specific method
		//Append--Append the new string in existing string
		//You have many append method based on which you have to append you can use that
		//For example if you want to append int value use append (int) method
		System.out.println(abc.append(21346));
		System.out.println(abc.append(false));
		
		//delete will delete the string of specific index
		System.out.println(abc.delete(0, 5));
		//deletecharAt will delete the specific character
		System.out.println(abc.deleteCharAt(8));
		
		System.out.println(abc.insert(4, true));
		System.out.println(abc.replace(0, 8, "Ruturaj"));
		System.out.println(abc.reverse());
	}
}
