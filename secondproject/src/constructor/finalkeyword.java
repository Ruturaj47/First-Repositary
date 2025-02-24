package constructor;

public class finalkeyword {
	
	public final float pi;
	//public static final int p;

	finalkeyword(){
		
		pi=3.14f;
		System.out.println("I am a constructor block");
	}

	finalkeyword(float p){
		
		pi=p;
		System.out.println("I am a constructor block 2");
	}

	/*static{
		
		System.out.println("I am a static block");
		p=3;
	}*/
	
	public static void main(String[] args) {
		finalkeyword obj=new finalkeyword(3.14f);
		System.out.println(obj.pi);
		finalkeyword obj1=new finalkeyword();
		
	}
	
}
