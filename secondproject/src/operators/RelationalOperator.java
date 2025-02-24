package operators;

public class RelationalOperator {

	public static void main(String[] args) {
		RelationalOperator obj=new RelationalOperator();
		obj.greaterthan(4, 8);
		obj.lessthan(9, 10);
		obj.equalto(7, 8);
		obj.greaterthanequalto(7, 7);
		obj.lessthanequalto(8,10);
		obj.notequalto(7, 7);
	}
	
	public void greaterthan(int a, int b) {
		System.out.println("A is greater than B " +(a>b));
	}
	
	public void lessthan(int a, int b) {
		System.out.println("A is less than B " +(a<b));
	}
	
	public void equalto(int a, int b) {
		System.out.println("A is equalto B " +(a==b));
	}
	
	public void greaterthanequalto(int a, int b) {
		System.out.println("A is greater than equal to B " +(a>=b));
	}
	
	public void lessthanequalto(int a, int b) {
		System.out.println("A is less than equal to B " +(a<=b));
	}
	
	public void notequalto(int a, int b) {
		System.out.println("A is not equal to B " +(a!=b));
	}
}
