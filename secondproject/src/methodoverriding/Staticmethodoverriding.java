package methodoverriding;

//Method hiding concept
//when you try to override the static method it is actually method hiding
public class Staticmethodoverriding {

	public static void m1(){
		System.out.println("I am from parent");

	}
	
	public void m2() {
		System.out.println("I am from parent from m2");
	
	}
	
	public static void main(String[]args) {
		
	}
	
}

class childclassoverridingstaticmethod extends Staticmethodoverriding{
	
	public static void m1(){
		System.out.println("I am from child");

	}
	
	public void m2() {
		System.out.println("I am from child from m2");
	
	}
	
	public static void main(String[]args) {
		//obj is childclassoverridingstaticmethod reference and referring to childclassoverridingstaticmethod object
		childclassoverridingstaticmethod obj=new childclassoverridingstaticmethod();
		//obj is referring to childclassoverridingstaticmethod then it will call referring to childclassoverridingstaticmethod
		obj.m1();
		//obj1 is parent class static method reference and referring to parent class static method object
		Staticmethodoverriding obj1=new Staticmethodoverriding();
		//obj1 is referring to parent class static method then it will call referring to parent class static method
		obj1.m1();
		//obj2 is parent class static method reference and referring to child class static method object
		Staticmethodoverriding obj2=new childclassoverridingstaticmethod();
		//obj2 is referring to parent class static method then it will call referring to parent class static method
		obj2.m1();//this is called method hiding
		//obj2 is referring to parent class static method but object has been created to child class so it will call child class m2 method
		obj2.m2();
	}
}
