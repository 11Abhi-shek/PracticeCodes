package javaproject1;

interface Abc
{
	void show();
}




public class InterfaceDemo 
{

	public static void main(String[] args) 
	{
       //Abc obj = new Implimentor();
		Abc obj = new Abc() 
		{
			public void show()
			{
				System.out.println("anything");
			}
		};
		obj.show();
		
		
	}

}
