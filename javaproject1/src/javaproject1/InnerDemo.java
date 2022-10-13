package javaproject1;

class Outer
{
//	int a;
	 static int a;
	
	//class Inner   //outer$Inner.class
	 static class Inner
	{
		//public void display()
		public static void display()
		{
			System.out.println("-->Display");
		}
	}
	public void show()
	{
		System.out.println("show");
	}
}

public class InnerDemo {

	public static void main(String[] args) {
		
		Outer obj =new Outer();
		//Outer.Inner obj2=obj.new Inner();
	Outer.Inner obj2=new Outer.Inner(); //in order to create static inner class we used class instead of obj
		obj.show();
		obj2.display();

	}

}
