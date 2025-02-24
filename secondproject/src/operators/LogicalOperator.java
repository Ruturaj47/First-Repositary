package operators;

public class LogicalOperator {

	public static void main(String[] args) {
		
		//And Condition
		System.out.println("Both Condition Is True Operator Test Is "+(4<5&&7>6));
		System.out.println("Both Condition Is False Operator Test Is "+(6<5&&5>6));
		System.out.println("First Condition Is True And Second Condition is False Operator Test Is "+(4<5&&5>6));
		System.out.println("First Condition Is False And Second Condition is True Operator Test Is "+(7<5&&7>6));

		//OR Condition
		System.out.println("Both Condition Is True Operator Test Is "+(4<5||7>6));
		System.out.println("Both Condition Is False Operator Test Is "+(6<5||5>6));
		System.out.println("First Condition Is True And Second Condition is False Operator Test Is "+(4<5||5>6));
		System.out.println("First Condition Is False And Second Condition is True Operator Test Is "+(7<5||7>6));
	}

}
