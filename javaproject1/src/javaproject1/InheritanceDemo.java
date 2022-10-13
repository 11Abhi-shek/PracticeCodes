package javaproject1;

class Calculator                        // Super class 
{
	public int add(int i ,int j)
	{
		return i+j;
	}
}

class CalcAdv extends Calculator        // sub class           IS-A relationship
{
	public int sub(int i, int j)
	{
		return i-j;
	}
}

class CalcVeryAdv extends CalcAdv        // sub class
{
	public int mul(int i, int j)
	{
		return i*j;
	}
}

public class InheritanceDemo {                      // HAS-A     relationship

	public static void main(String[] args) 
	{
		CalcVeryAdv obj = new CalcVeryAdv();
		int res=obj.add(4, 5);
		int res1=obj.sub(9, 7);
		int res3=obj.mul(4, 5);
		System.out.println(res);
		System.out.println(res1);
		System.out.println(res3);

	}

}
