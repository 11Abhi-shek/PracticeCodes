package javaproject1;

public class Patter_p {

	public static void main(String[] args) {
		// PATTERN 1
		//int n=6;
//		for(int i=1;i<=6;i++) {
//			for(int j=1;j<=i;j++) {
//				//System.out.print(" * ");
//				//System.out.print(j);
//				}
//			System.out.println("");
//	}
//     PATTERN 2
//		int n1=3;
//		for(char ch=65;ch<68;ch++) {
//			for(char ch1=65;ch1<=ch;ch1++) {
//					System.out.print(ch1 + " ");
//				    System.out.println("");
//			}
//		    }
		
	//PATTERN 3	
		int n =4;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				
				if(i==1 || i==n ||j==1 ||j==n)
				{
					System.out.print(" $ ");
				}
				else
				{
					System.out.print("   ");
				}
			}
			System.out.print("\n");
		}
			
			
				
		
}
}
