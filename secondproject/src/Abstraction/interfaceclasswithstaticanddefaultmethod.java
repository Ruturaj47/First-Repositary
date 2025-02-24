package Abstraction;

public class interfaceclasswithstaticanddefaultmethod implements Interfacewithstaticanddefaultmethod,interfacewithstaticanddefaultmethod2{ 

	public static void main(String[] args) {
		
		interfaceclasswithstaticanddefaultmethod obj=new interfaceclasswithstaticanddefaultmethod();
		obj.add(8, 4);
		obj.sub(8, 7);
		Interfacewithstaticanddefaultmethod.multiplication(8, 5);
		interfacewithstaticanddefaultmethod2.multiplication(7, 4);
	}

	//Both interface having same abstract method but while implementing you need have only one implementation
	public void add(int a, int b) {
		
		System.out.println("Addition" +(a+b));
	}

	//Both interface having same default method to resolve ambuigity java force us to mentions which interface method we have to call
	public void sub(int a, int b) {
		
		Interfacewithstaticanddefaultmethod.super.sub(a, b);
	}

}
