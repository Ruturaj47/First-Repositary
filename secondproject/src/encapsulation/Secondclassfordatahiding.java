package encapsulation;

public class Secondclassfordatahiding {

	public static void main(String[] args) {
		Datahiding obj = new Datahiding();
		int a=obj.getbalance(123);
		System.out.println(a);
		obj.setbalance(10000);
		a=obj.getbalance(123);
		System.out.println(a);
	}

}
