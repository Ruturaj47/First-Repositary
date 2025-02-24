package Exception;

public class Sampleexception {

	public static void main(String[] args) {

		Sampleexception obj=new Sampleexception();
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
			System.out.println(10/0); //unwanted event which terminate normal flow of execution
		} catch(ArithmeticException a) {
			System.out.println("Finally i caught the exception");
		}
		
	}
}
