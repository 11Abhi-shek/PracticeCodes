package javaproject1;

class X
{
	public void show()
	{
		System.out.println("in A");
	}
}
class Y extends X
{
	//@Override        notation for the mistake
	public void show()             // overriding methods
	{
		//super.show();              // through super key word you can call show()  of super class
		System.out.println("in B");
	}
	public void config()
	{
		System.out.println("config..");
	}
}

class Z extends X
{
	public void show()
	{
		System.out.println("in c");
	}
}

// compile time and runtime polymorphism
public class OverridingDemo 
{

	public static void main(String[] args) 
	{
		//Y obj = new Y();
		//X objt = new X();
		X obj1 = new Y();     // it will link at run time ..run time ploymorphism
		obj1.show();           // it will call the sub class method(show)
		//obj1.config(); 
		// error be class A doesnot know about config only know show that's why we can access it
		
		obj1= new Z();  // with help of one reference we can create many objects
		obj1.show();    // dynamic method dispatch
	}

}
