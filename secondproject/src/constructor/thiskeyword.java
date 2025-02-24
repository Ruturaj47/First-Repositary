package constructor;

public class thiskeyword {

	int a;//declaration+initialization
	int b;
	public void M1() {
		M2(8, 5);
		System.out.println("Reference id of this "+this);
	}//if you have a instace variable or method you need to create object
	
	public void M1(thiskeyword test) {
		
		System.out.println(test);
	}
	
	public void M2(int a , int b) {
		this.a=a;
		this.b=b;
		System.out.println(a);
	}
	
	
	public static void main(String[] args) {
		thiskeyword obj=new thiskeyword();
		System.out.println("Reference id of obj "+obj);
		thiskeyword abc=new thiskeyword();
		System.out.println("Reference id of abc "+abc);
		obj.M1();
		abc.M1(obj);
		
	}

}
