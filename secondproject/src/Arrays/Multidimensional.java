package Arrays;

public class Multidimensional {

	//single dimensional array
	public static int[]arr;
	
	//2-d array
	public static int[][]arr1;
	
	//3-d array
	public static int [][]arr2;
	public static void main(String[]args) {
		
		//if your array is 2-D you need to provide size for both dimension
		//arr1=new int[2][2];
		arr1=new int[2][2];
		
		arr1[0][0]=5;
		arr1[0][1]=15;
		arr1[1][0]=25;
		arr1[1][1]=35;
		//arr[1][2];
		
		for(int i=0;i<2;i++) {  //first iteration i=0
			System.out.println(arr1[i][0]);  //arr1[0][0]
			System.out.println(arr1[i][1]);  //arr1[0][1]
			
			//second iteration
			//i=1
			//arr1[1][0]
			//arr1[1][1]
			
		}
		
		//first iteration i=0
		for(int i=0;i<2;i++) { 
			for(int j=0;j<2;j++) { //first iteration j=0
				System.out.println(arr1[i][j]);  //arr1[0][0] //arr1[0][1]
			}
		}
	}
	

}
