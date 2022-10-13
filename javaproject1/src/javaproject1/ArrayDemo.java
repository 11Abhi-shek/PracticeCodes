package javaproject1;

public class ArrayDemo {

	public static void main(String[] args) {
	
		// for-each loop
		int a[]= {1,2,3,4,5};
//		
//		for(int k :a) {
//			System.out.print(" "+k);//only k not a[k]
//		}
		
		System.out.println();
		
		// Multidimensional Array
		
		int d[][]= {
				{1,2,3,4},
				{5,6,7,8},
				{3,6,7,8}
				
         		            
				};
		for(int k[]:d) {
			for(int l :k) {
				System.out.print(" "+l);
			}
			System.out.println("");
		}
		
		System.out.println("\n");
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++)
			{
				System.out.print(" "+d[i][j]);
			}
			System.out.println("");
		}

	}

}
