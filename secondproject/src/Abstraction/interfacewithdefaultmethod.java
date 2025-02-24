package Abstraction;

public interface interfacewithdefaultmethod {

	//This is default method==because there is keyword called default
	//Method name=defaultmethod
	//return type=void
	//Parameter=zero
	default void defaultmethod() {
	
		System.out.println("I am from default method");
	}
	
	//even interface support implementation you access modifier should be public
	//if you use other access modifier you will get error
	//Method name=defaultmethod
	//return type=void
	//Parameter=one parameter
	public default void defaultmethod(int a) {
	
		System.out.println("I am from one parameter of default method");
		
	}
}
//Interface = default , abstract , static
//if you have only method declaration then writing abstract is not mandatory
//but if you are implementing any method within interface it should be either default or static
//default keyword in interface does't have any relation with default access modifier