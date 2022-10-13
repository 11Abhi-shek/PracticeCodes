package javaproject1;

class Casio{
	
	int num1;
	int num2;
	//method overloading
	
	public void add(int i,int j)
	{
		System.out.println(i+j);
	}
	public void add(int i,int j,int k)
	{
		System.out.println(i+j+k);
	}
	public void add(int i,float j)
	{
		System.out.println(i+j);
	}
	
	
	
}
public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Casio obj = new Casio();
		obj.add(2,7);
		obj.add(2,7,9);
		obj.add(2,7.8f);

	}

}
