package inheritancepractice;


class father{
	public void car() {
		System.out.println("i am from father class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		father obj=new father();
		obj.car();
	}
}
public class Multilevelinheritance extends father {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
class grandchild extends Multilevelinheritance{
	public void m1() {
		
	}
}

}
