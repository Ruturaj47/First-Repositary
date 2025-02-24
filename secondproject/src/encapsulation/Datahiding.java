package encapsulation;

public class Datahiding {

	//you are not allowing your data member to be access directly outside the class
	private int balance=500;
	private int deposit;
	private int loaneligibility;
	
	//To access private data member we will have public method
	public int getbalance(int accountnumber) {
		if(accountnumber==123) {
			return this.balance;
		} else {
			return 0;
		}
		
	}
	
	public int getdeposit() {
		return this.deposit;
	}
	
	public int loaneligibility() {
		return loaneligibility;
	}
	
	public void setbalance(int balance) {
		this.balance=balance;
	}
	
	public void setdeposit(int deposit) {
		this.deposit=deposit;
	}
	
}
