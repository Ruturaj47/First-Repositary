package Abstraction;

public class Childabstractclass extends Abstractclass{

	public Childabstractclass() {
		System.out.println("I am from child class constructor");
	
	}
	public void M2() {
		System.out.println("I am from child class from m2 method");
		
	}

	public void M3() {
		System.out.println("I am from child class from m3 method");		
	}
	

	public static void main(String[]args) {
		Childabstractclass obj=new Childabstractclass();
		obj.M1();
		obj.M2();
		obj.M3();
	}
}
