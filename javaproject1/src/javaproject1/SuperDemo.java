package javaproject1;


class A
{
	public A() 
	{
		System.out.println("in A");
	}
	public A(int i) 
	{
		System.out.println("in A int ");
	}
}

class B extends A
{
	public B()                // constructor
	{
		super();
		System.out.println("--in B");
	}
	public B(int i)                // constructor
	{
		super( i);
		System.out.println("--in B--int");
	}
}
public class SuperDemo 
{

	public static void main(String[] args)
	{
		 B obj = new B(5);
		 

	}

}
