package Abstraction;

public interface firstinterface {

	//for variable access modifier is always public
	//Each and every variable will be static and final
	//Within interface if we declare variable it is mandatory to be initialize
	//within interface you will only have public static final variable
	int a=4;
	
	//After compilation variable name will be like below
	//public static final int a=4;
	
	//if you try to add another access modifier you will get compilation error
	//protected int b=1;
	
	//No need to add abstract keyword
	//By default only public access modifier is allow for method
	public int add();
	int sub();
	//within interface till java 8 you will have only instance method

	//As each and every method is abstract by default after compilation definition will change as
	//public abstract void add();
}
