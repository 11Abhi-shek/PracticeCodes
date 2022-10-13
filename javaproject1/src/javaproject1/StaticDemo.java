package javaproject1;

class Emp{
	int eid;
	int salary;
	static String ceo;
	
	static   // when you load a class  and it will load only once
	{
		ceo="asif";
		System.out.println("in static"); // static it appear first
	}
	public Emp() // constructor --->when we create class  --> it will load as many times object will create
	{
		eid=15;
		salary=3000;
		System.out.println("in cons");
	}
	public void show()
	{
		System.out.println(eid+":"+salary+":"+ceo);
	}
	
}

public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp abhi = new Emp();
		Emp abhishek = new Emp();
	//Emp.ceo="himanshu";
//		abhi.eid=10;
//		abhi.salary=20000;
//		abhishek.eid=11;
//		abhishek.salary=23000;
		//abhi.ceo="ajay";
		abhi.show();
		abhishek.show();

	}

}
