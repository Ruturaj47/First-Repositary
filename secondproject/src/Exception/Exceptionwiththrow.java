package Exception;

public class Exceptionwiththrow {

	public static void main(String[] args) {

		Exceptionwiththrow obj=new Exceptionwiththrow();
		obj.m1("ruturaj", "");
	}
	
	//string can empty to logically there should be any issue
	//but functionality wise we don't allow password as empty 
	public void m1(String username,String password) {
		try {
			if(password.isEmpty())//as string can be empty so method will not throw exception
				//As functionality don't allow password as empty now its programmer responsibility 
				//to create exception object wihin method
				throw new NullPointerException();
		}
		catch(NullPointerException a) {
			System.out.println("please enter valid credentials");
		}
	}

}
