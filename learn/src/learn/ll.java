package learn;


class first{	
	first()
	{
		System.out.println("first constructor");
	}
	void hello()
	{
		System.out.println("first class");
	}
}

class second extends first{
	second()
	{
		System.out.println("second constructor");
	}
	void hello()
	{
		System.out.println("second class");
	}
}
public class ll {
	
	public static void main(String[] args) {
		first se=new second();
		se.hello();
		
	}
	


}
