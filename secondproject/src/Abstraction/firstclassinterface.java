package Abstraction;

//you need to use implement keyword when trying to extends interface
//compiler will give error to provide implementation for abstract method from interface
public class firstclassinterface implements firstinterface {


	public static void main(String[] args) {
		firstclassinterface obj=new firstclassinterface();
		obj.add();
		obj.sub();
		System.out.println(firstclassinterface.a);
	}

	public int add() {
		System.out.println("i am from add method");
		return 0;
	}

	
	public int sub() {
		System.out.println("i am from sub method");
		return 0;
	}
  
}
