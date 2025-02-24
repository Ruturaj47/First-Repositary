package inheritancepractice;

public class Singleinheritance extends animal{

	Singleinheritance(){
		this(8);
		//super(); //super keyword is similar to this keyword only difference it called parent class constructor
		//adding super is not mandatory if not added java will add it
		//you can use this or super anyone in first statement 
		System.out.println("i am from dog class 1");
	}
	
	Singleinheritance( int a){
		super(56);
		//this.a=a;
		//here super will added by java by default
		//if the parameterized constructor called from parent class by child then add super keyword manually 
		System.out.println("i am from dog class 2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleinheritance obj=new Singleinheritance();
		System.out.println(obj.a);
	}

}
