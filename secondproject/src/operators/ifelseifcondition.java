package operators;

public class ifelseifcondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=15;
		//print the message as i am less than 10
		//print the message as i am greater than 10 but less than 20
		//print the message as i am greater than 20
		
		if(a<10) {
			System.out.println("i am less than 10");
		}else if(a>10&&a<20) {
			System.out.println("i am greater than 10 but less than 20");
		}else {
			System.out.println("i am greater than 20");
		}
	}

}
