package methodoverriding;

//method overriding is nothing but a mechanism to provide specific implementation of a method by super class
//In methodoverriding show the compilation error if return type has mismatched 
//In methodoverloading return type does'nt play any role 
//Child class access modifier should be same or more accessible modifier than parent class
//In methodoverrriding the method signature should be same.
//method overloading within the class and method overriding is in a parent child class relation or inheritance.
//In methodoverriding access modifier should be same or more accessible than parent class.
class Animal {
	
	public void sound() {
		System.out.println("No Sound");
	}
	
	public void sleep() {
		System.out.println("I am from parent class");
	}
}
	
	class dog extends Animal{
		
		public void sound() {
			System.out.println("Bark");
		}
	}
	
	public class Cat extends Animal{
		
		public void sound() {
			System.out.println("Meaw");
		}
		
		public static void main(String[] args) {
			Cat obj=new Cat();
			obj.sound();
			obj.sleep();
			dog obj1=new dog();
			obj1.sound();
			}
		}
	