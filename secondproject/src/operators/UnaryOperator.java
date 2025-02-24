package operators;

public class UnaryOperator {

	public static void main(String[] args) {
		UnaryOperator obj=new UnaryOperator();
		obj.positive(-7);
		obj.negative(-6);
	}

	public void positive(int a) {
		System.out.println("I am operator to represent positive "+(+a));
	}
	
	public void negative(int b) {
		System.out.println("I am operator to represent negative "+(-b));
	}
}
