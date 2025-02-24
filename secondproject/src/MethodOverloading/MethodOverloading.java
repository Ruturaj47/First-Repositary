package MethodOverloading;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading obj=new MethodOverloading();
		obj.multiplication(4,5);
		obj.multiplication(7,45f);
		obj.multiplication(5,4);
		obj.multiplication(0,5,4);
		
	}
	
	public void multiplication(int a, int b) {
		System.out.println("I'm From  Multiplication" +a);

	}
	
	public void multiplication(int a, double b) {
		System.out.println("I'm From  Multiplication" +b);

	}
	
	public void multiplication(int a, double b, int c) {
		System.out.println("I'm From  Multiplication" +c);

	}
	
	public void multiplication(double a, int b) {
		System.out.println("I'm From  Multiplication" +a);

	}
}