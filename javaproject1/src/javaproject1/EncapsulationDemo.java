package javaproject1;

// Binding data with methods
class Student
{
	private int rollno;
	private String name;
	public int getRollno() {
		System.out.println("user accessing the value");    // just for the locking the system
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
		System.out.println("user changes the values");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// Getters And Setters
	
}

public class EncapsulationDemo {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.setRollno(3);
		s1.setName("navin");
		System.out.println(s1.getRollno()+" "+s1.getName());

	}

}
