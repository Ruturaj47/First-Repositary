package Typecasting;

import MethodOverloading.*;

public class Packageexplaination {

	public static void main(String[] args) {
		//var1 is having data type as byte
		byte var1=5;
		//var2 is having data type as int
		//Type casting = process of converting one data type to another
		//line no 14 = byte is converting into int
		int var2=var1;  //Automatic typecasting(implicit casting)
		System.out.println(var2);
		
		int var3=560;
		//we are trying to convert data type from int to byte
		//compiler will give error as can not convert int to byte
		//why error ?= as int size is bigger than byte
		byte var4=(byte)var3;  //casting manually by programmer - explicit casting
		System.out.println(var4);  //byte 2^7=128 2^8=256-300=44 2^9=512-560=48
		
		
		
	}

}
