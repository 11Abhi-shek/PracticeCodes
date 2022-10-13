package javaproject1;

abstract class Human
{
	public abstract void eat();
	public void walk()
	{
		
	}
}
class Man extends Human     // Concrete-
{
	public void eat()
	{
		
	}
}

class Painter
{
	public void show(Number i)
	{
		System.out.println(i);
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		
		//Human obj = new Man();
		
		Painter obj = new Painter();
		obj.show(5.56);

	}

}
