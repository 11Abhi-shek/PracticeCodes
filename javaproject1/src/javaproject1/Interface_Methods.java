package javaproject1;

// Abstract class --> defines and declare 
// interface --> declare --> 1.7
// 1.8 can define methods in interface


@FunctionalInterface
interface Demo
{
	void abc();
	default void show()
	{
		System.out.println("in show ");
	}
}
class DemoImp implements Demo
{
	public void abc() 
	{
		System.out.println("in abc");
	}
	public void show()
	{
		System.out.println(" in new show"); // override
		
	}
}
public class Interface_Methods {

	public static void main(String[] args) {
		
		Demo obj = new DemoImp();
		obj.abc();
		obj.show();

		
	}

}
