package Abstraction;

public interface Interfacewithstaticanddefaultmethod {

	//abstract method
	void add(int a , int b);//compiler will convert to public abstract void add()
	
	//default method
	default void sub(int a , int b) {
		System.out.println("Substraction"+(a-b));
	}
	
	//static method
	static void multiplication(int a , int b) {
		System.out.println(a*b);
	}
	

}
