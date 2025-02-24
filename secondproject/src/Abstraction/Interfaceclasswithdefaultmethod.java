package Abstraction;
 
//As interfacewithdefaultmethod has two default method with implementation
//compiler will not show any error to implement method from interface

public class Interfaceclasswithdefaultmethod implements interfacewithdefaultmethod,anotherinterfacewithdefaultmethod {

	public static void main(String[] args) {

		Interfaceclasswithdefaultmethod obj=new Interfaceclasswithdefaultmethod();
		obj.defaultmethod();
		obj.defaultmethod(5);
	}

	@Override
	public void defaultmethod() {
		// TODO Auto-generated method stub
		anotherinterfacewithdefaultmethod.super.defaultmethod();
	}

	

}
