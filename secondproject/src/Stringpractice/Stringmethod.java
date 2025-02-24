package Stringpractice;

public class Stringmethod {
	
	//var is storing string in upper case
	public static String var="TESTING ";
	//var1 is storing string in lower case
	public static String var1="testing";

	
	public static void main(String[] args) {

		//length method need to use to check the length of a string
		//Length calculation will start from 1
		System.out.println("Length of String "+var.length());
		
		//tell me which the character at position within the string
		//CharAt take one parameter that is index which is start from 0
		//String var="Testing" so this indexing will be 0123456
		//so s will be printed for position 2
		System.out.println("character at second position "+var.charAt(2));
		
		//If we try to retrive character at position which is not present
		//then java will throw StringIndexOutof Bound exception
		//System.out.println(var.charAt(7));
		
		//checking whether string is empty or not
		System.out.println("checking whether string is empty or not "+var.isEmpty());
		
		//checking whether two string is equal or not
		System.out.println("checking whether both the string is same or not "+var.equals(var1));
		
		//checking whether two string is equal or not
		System.out.println("checking whether both the string is same or not "+var.equalsIgnoreCase(var));
		
		//checking whether string is start with tes
		System.out.println("checking whether var is start with T "+var.startsWith("T"));
		
		//var="TESTING" in below is used  tolowercase method it will change string
		//from uppercase to lowercase
		System.out.println(var.toLowerCase());
		
		//var="testing" in below is used  touppercase method it will change string
		//from lowercase to uppercase
		System.out.println(var.toUpperCase());
		
		//checking whether string is start with tes
		System.out.println("checking whether var is start with t "+var.toLowerCase().startsWith("t"));
		//two method call in one statement called as string method chaining 
		//it is applicable for string not  boolean
		
		//concat method is used to join the two string
		String a=var.concat("Software");
		System.out.println(a);
		
		//Java is case sensative
		System.out.println("checking whether string contains perticular value "+var.contains("T"));
		
		//replace the string to the another string
		System.out.println("replace the old string with new one "+var.replace("TESTING", "Software"));
		
		//return type of split is array string
		//split is used to divide the string but as java is machine we need to tell how you want to do split
		//In below problem we are asking java to split var with G as criteria 
		System.out.println(var.split("I")[1]);
		
		//Trim will remove front and back space but not the remove sapce which is in the middle
		String var2=("   Testing for the space termination   ");
		System.out.println(var2.trim());
		
		//Index of return type is int
		//As name suggest it will retrieve the index of particular string
		//if string is not found then it will return -1
		System.out.println(var.indexOf("T"));
		
		System.out.println(var.indexOf(84)); //ask via ascii value
		
		System.out.println(var.indexOf("T", 2));
		
		System.out.println(var.lastIndexOf("S"));
		
		System.out.println(var.substring(1));
		
		System.out.println(var.substring(1, 4));

	}

}
