package javaproject1;

abstract class Writer
{
	public abstract void write();
}
 class Pen extends Writer
{
	public void write() 
	{
		System.out.println("I am a pen");
	}
}
 class Pencil extends Writer
{
	public void write() 
	{
		System.out.println("I am a pencil");
	}
}
class Kit
{
	public void doSomething(Writer p)
	{
		p.write();
	}
}
public class Abstract_new {

	public static void main(String[] args) {
		 
		Kit k = new Kit();
		
		Writer p = new Pen();
		Writer pc = new Pencil();
		
		k.doSomething(pc);
		
		
		

	}

}
