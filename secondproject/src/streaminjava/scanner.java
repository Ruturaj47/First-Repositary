package streaminjava;

import java.util.Scanner;

public class scanner {
	//To take the value from console
	public static void main(String[] args) {
		System.out.println("please let me know the value is even or odd");
		Scanner obj=new Scanner(System.in);
		int var=obj.nextInt();
		if(var%2==0) {
			System.out.println(var+" number is even");
			
		}else {
			System.out.println(var+" number is odd");

		}
		System.out.println("please enter the string");
		String var1=obj.next();
		System.out.println(var1);
		System.out.println("please enter the string");
		String var2=obj.nextLine();
		System.out.println(var2);
		
		
	}

}
