package Abstraction;

public class secondclassinterface implements firstinterface,secondinterface{

	public static void main(String[] args) {
		secondclassinterface obj=new secondclassinterface();
		obj.add();
		obj.sub();
	}

	
	public int add() {
		System.out.println("i am add method from interface");
		return 0; 
	}

	public int sub() {
		// TODO Auto-generated method stub
		return 0;
	}

}
