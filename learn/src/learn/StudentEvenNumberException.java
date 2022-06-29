package learn;

public class StudentEvenNumberException extends Exception
{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	StudentEvenNumberException(String str)
	{
//		System.out.println("even number only needed!");
		super(str);
	}
	
}
