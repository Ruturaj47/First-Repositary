package Abstraction;

//whenever you add abstract non-access modifier in class it become abstract class 
public abstract class Abstractclass {
	
	//Abstract class can have instance variable/static variable
	int a;
	static int b;
	
	//Though you can't create object of abstract class but you can have a constructor
	public Abstractclass() {
		System.out.println("I am from abstract class but i have a constructor");
	
	}
	
	//this is instance method
	//To call instance method you need to create object but abstract class can't create object
	public void M1() {
		System.out.println("i am from non abstract method");
	
	}
	
	//Abstract method
	public abstract void M2();// this is having only declaration
	public abstract void M3();
	
	//private abstract void M4(); // you cannot create abstract method with private modifier
	
	//public static abstract coi M5(); //we can't write abstract static method that way because static and abstract both are non access modifier
	public static void main(String[]args) {
		
	}
	
}