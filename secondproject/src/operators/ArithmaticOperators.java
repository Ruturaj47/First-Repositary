package operators;

public class ArithmaticOperators {

	public static void main(String[] args) {
		ArithmaticOperators obj=new ArithmaticOperators();
		obj.add(5, 6);
		obj.sub(7,6);
		obj.multi(8, 5);
		ArithmaticOperators.div(8,2);
		ArithmaticOperators.modulus(2);
	}
		public void add(int a, int b) {
			System.out.println("This is add Oparator Test " +(a+b));
		}
		
		public void sub(int a, int b) {
			System.out.println("This is Sub Oparator Test " +(a-b));
		}
		
		public void multi(int a, int b) {
			System.out.println("This is multi Oparator Test " +(a*b));
		}
		
		public static void div(int a, int b) {
			System.out.println("This is div Oparator Test " +(a/b));
		}
		
		public static void modulus(int a) {
			System.out.println("This is modulus Oparator Test " +(a%2));
		}
}