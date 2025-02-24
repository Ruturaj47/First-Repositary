package constructor;

public class constructorpractice {

	int a;
	int b;
	boolean c;
	
	public constructorpractice() {
		this(5);
		System.out.println("I'm constructor");
		this.a=15;
		this.b=68;
		this.c=true;  //default object

	}
	
	
	public constructorpractice(int a) {
 		System.out.println("I'm parameterized constructor");
	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		constructorpractice obj=new constructorpractice();  
		//object create then constructor call
		//what constructor--initialize variable
		//if you dont provide--compiler will add default constructor
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);

		constructorpractice obj1=new constructorpractice(8);
		System.out.println(obj1.a);
		System.out.println(obj1.b);
		System.out.println(obj1.c);
	}

}
