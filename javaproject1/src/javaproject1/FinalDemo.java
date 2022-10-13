package javaproject1;

class K
{
	final int DAY;   // constant we can assign here also
	public K() 
	{
		DAY=10;
	}
}
public class FinalDemo {

	public static void main(String[] args) {
		
		K obj = new K();
		
		System.out.println(obj.DAY);

	}

}
