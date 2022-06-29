package learn;

import java.util.Optional;

public class details {

	private String name;
	
	
	public static void main(String[] args) {
	Optional op=	Optional.empty();
	String hehe= Optional.of("String").get();
	Optional c=Optional.ofNullable("cccc");
		System.out.println(op);
		System.out.println(hehe);
		System.out.println(c);
		
		System.out.println();
	}
	
	
	
}
