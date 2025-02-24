package Arrays;

import java.util.Arrays;

public class Arrayexample {
	
	int a; //normal variable declaration
	static int b[];//array declaration--single dimensional
	static int c[]= {1,2,3,4,5,6,7,8,9,10}; //declaration+initilization
	static int []rollno;
	//instance variable
	int []marks;
	
	public static void main(String[] args) {
		
		//initilization of array
		//arrayname=new datatype[size]
		b=new int[5];
		rollno=new int[100];
		//one approach to assign the value to array
		rollno[0]=1;
		rollno[1]=2;
		rollno[2]=3;
		rollno[3]=4;
		rollno[4]=5;
		rollno[5]=6;
		//if you want to act smart please use for loop else first approach
		for (int i=0;i<100;i++) {
			rollno[i]=i+1;
		}
		System.out.println("First student of school "+rollno[0]);
		//Array indexing start from zero so if you size is 100 then
		//last index of array should size-1 ==99
		
		System.out.println("Last admission in school "+rollno[99]);
		
		//instance array initialization
		Arrayexample obj=new Arrayexample();
		obj.marks=new int[5];
		
		//condition 1-if you try to access array out of index 
		//at run time you will get the Arrayindexoutofbound exception
		//so you can't access array part from declare size
		//obj.marks[6]=45;
		
		//you can the size of array but it is as good as creating new array
		obj.marks=new int[10];
		//at the time of initialization if you don't assign value then java will assign
		//default value as marks is holding int values so default value will be zero
		for (int j=0;j<10;j++) {
			obj.marks[j]=j+1;
			System.out.println(obj.marks[j]);
		}
		
		//we will get the null pointer exception in below if trying to access array without int
		//System.out.println(percentage[0]);
		//if i want to know the size/length of array i can use length data member
		//of java's inbuilt class arrays like below
		System.out.println(rollno.length);
		
		//rewriting above for loop with length
		for (int j=0;j<obj.marks.length;j++) {
			System.out.println(obj.marks[j]);
		}
		//iterating array through for each loop
		//please iterate through all the array element one by one
		for(int i:rollno) {
			System.out.println("roll no " +i);
			System.out.println("Welcome to our college");
			System.out.println("Welcome kit");
			System.out.println("Laptop");
		}
		//we are using tostring method of array class
		//it is overloaded method for all data types
		System.out.println(Arrays.toString(obj.marks));
	}
	
}
