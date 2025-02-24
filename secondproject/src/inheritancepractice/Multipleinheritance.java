package inheritancepractice;

class vehicle{
	public void speed(){
		System.out.println("i am from vehicle class");
	}
}

class car{
	public void speed(){
		System.out.println("i am from car class");
	}
}


public class Multipleinheritance extends vehicle{
	
	public void cartype() {
		System.out.println("verna");
	}
	public static void main(String[] args) {
		Multipleinheritance obj=new Multipleinheritance();
		obj.cartype();
		obj.speed();

	}

}
