package operators;

public class nestedifcondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=19;
		int weight=50;
		
		if(age>=18) {
			
			if(weight>50) {
				System.out.println("You can donate the blood");
			}else {
				System.out.println("i am under weight");
			}
		}else {
			System.out.println("i am under age");
		}
	}

}
