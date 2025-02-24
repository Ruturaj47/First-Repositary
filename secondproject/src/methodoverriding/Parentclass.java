package methodoverriding;

public class Parentclass {
	
	public void bike() {

		System.out.println("i am from bike class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class child extends Parentclass{
	
	public void bike() {

		System.out.println("i am from child bike class");
	}
	public static void main(String[]args) {
		child obj=new child();
		obj.bike();
	}
}
