package javaproject1;

 class Sum {
	public int add(int ...n)
	{
		int sum=0;
		for(int i :n)
		{
		sum +=i;
	}
		return sum;
	
}
 }

public class Varargs {

	public static void main(String[] args) {
		
		Sum obj = new Sum();
		System.out.println(obj.add(1,3,2,3));

	}

}
