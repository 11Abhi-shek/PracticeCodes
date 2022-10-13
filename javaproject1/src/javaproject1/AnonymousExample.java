package javaproject1;

class L
{
	public void show()
	{
		System.out.println("in A show");
	}
}

class M extends L
{
	
}

public class AnonymousExample 
{

	public static void main(String[] args) 
	{
		L obj = new M() // Anonymous class
				{
			public void show()
			{
				System.out.println("in the best");
			}
				};
		obj.show();

	}

}
