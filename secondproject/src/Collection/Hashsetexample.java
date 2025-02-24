package Collection;

import java.util.HashSet;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Hashsetexample {

	public static void main(String[] args) {

		HashSet<Object> obj=new HashSet<Object>();
		obj.add("First icecream");
		obj.add("second icecream");
		obj.add("third icecream");
		obj.add("First icecream");  //duplicate object --it will overwrite the existing object 

		System.out.println(obj);
		
		HashSet<Object> obj1=(HashSet<Object>) obj.clone();
		System.out.println(obj1);
	
	
		
	}

}
