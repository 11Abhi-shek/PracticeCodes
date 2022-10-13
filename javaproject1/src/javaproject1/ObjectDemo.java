package javaproject1;

class Calc{
	int num1;
	int num2;
	int res;
	
	public void perform()
	{
		res=num1+num2;
	}
}

public class ObjectDemo {

	public static void main(String[] args) {
		
            Calc obj =new Calc();  // who knows something and does something
            obj.num1=5;
            obj.num2=6;
            obj.perform();
            System.out.println(obj.res);
	}

}
