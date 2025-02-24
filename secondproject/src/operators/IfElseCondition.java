package operators;

public class IfElseCondition {

	public static void main(String[] args) {

		int var=120;
		
		if(var%2==0) {
			//java will calculate the reminder var&2
			//if 1==0 then false ; 0==0 then true
			
			System.out.println("This is even number " + var);
		
		}else{
			System.out.println("This is odd number");
	}
	}
}