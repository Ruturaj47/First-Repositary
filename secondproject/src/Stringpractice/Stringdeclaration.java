package Stringpractice;

public class Stringdeclaration {

	//String declaration
	public static String var;
	public Stringdeclaration var1;
	public int var2;
	
	//String initialization  can be done in two way
	//By using literal
	//1.String a="abc";
	//2.String var=new String("abc");
	
	public static void main(String[] args) {
		//String initialization
		var=new String("ruturaj");
		System.out.println(var);
		//String a="abc"; //Declaration + initialization
		String b=var.concat("ahire");
		System.out.println(b);
		//string is immutable once you created then you cannot modify
		
		
		//Stringbuffer is mutable
		StringBuffer obj=new StringBuffer("ruturaj");
		obj.append("ahire");
		System.out.println(obj);
	}

}
