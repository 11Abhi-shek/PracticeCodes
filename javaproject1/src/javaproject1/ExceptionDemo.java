package javaproject1;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			int a[]=new int[6];
			a[6]=8;   //this will shows an error because array start from 0-n-1
			//int a[]=null; //null point exception
			 a[2]=6;
			int i=7;
			int j=0;
			int k=i/j;  // this is arithmetic exception
			System.out.println("output is "+ k);
		}
		//catch(Exception e)
		//this is for general purpose
		catch(ArithmeticException e)
		{
			System.out.println("Error ");
		}
		catch( ArrayIndexOutOfBoundsException e)
		{
			System.out.println("stay in the limit");
		}
		catch(Exception e)  // we should use in the last
		{
			System.out.println("Something error");
		}
		
		finally
		//this block will always excute
		{
			System.out.println("Bye");
		}

	}

}
