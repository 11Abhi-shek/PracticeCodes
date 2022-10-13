package javaproject1;

// int float, double
//Integer---- is a type of class 

public class WrapperDemo {

	public static void main(String[] args) {

		int i =5;  // Primitive datatype
		
		Integer ii = new Integer(i); // Boxing --- Wrapping --by putting the int i 
		
		int j =ii.intValue(); // unboxing -- unwrapping
		
		Integer value = i;  //AutoBoxing
		
		int k = value;  //autounboxing   
		
		String str = "123";
		
		int n = Integer.parseInt(str);  //-----use of parseInt
		System.out.println(n);
		

	}

}
