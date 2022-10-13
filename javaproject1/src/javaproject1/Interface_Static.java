package javaproject1;

@FunctionalInterface
interface Edmo
{
	int num =8;
	void abc();
	
	static void show() 
	{
		System.out.println("hi");
	}
}

class Edmo_Emp implements  Edmo
{
	public void abc()
	{
		//num =9;
	}
}

public class Interface_Static {

	public static void main(String[] args) {

		
		Edmo.show();

	}

}
