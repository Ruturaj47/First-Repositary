package Exception;

public class Exceptionexample {
	public static Exceptionexample obj;
	int []a;
	
	public static void main(String[] args) {

		Exceptionexample obj=new Exceptionexample();
		obj.m1();	
		System.out.println("i am from main");
	}
	public void m1() {
		m2();
		System.out.println("I am from m1");
	}
	
	public void m2() {
		System.out.println("I am from m2");
		
		try {
			//Null pointer exception
			System.out.println(a.length);
			//Arithmetic exception
			System.out.println(10/0); //unwanted event which terminate normal flow of execution
		
			//It is run the code in any exception do not need to declare particular exception 
		} catch(Exception b) {
			System.out.println(b.toString());
			System.out.println("I am from nullpointer exception");
		
		} /*catch(ArithmeticException a) {
			System.out.println("Finally i caught the exception");
		
		} catch(NullPointerException b) {
			System.out.println(b.toString());
			System.out.println("I am from nullpointer exception");
		}*/
		finally {
			obj=null; //memory release
			System.out.println("This is block to release the resources at any cost");
		}
		
	}
}


