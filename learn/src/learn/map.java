package learn;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class map {

	
	public static void main(String[] args) {
		
		List<student> st=new LinkedList<>();
		st.add(new student("abc",1,Arrays.asList("physics","science","computerscience")));
		st.add(new student("xyz",2,Arrays.asList("theory","machine learning","social")));
		st.add(new student("lmn",3,Arrays.asList("kannada","english","hindi")));
		
//		System.out.println(st);
		
		System.out.println(st.stream().map(e1->e1.getDeptName()).collect(Collectors.toList()));
		System.out.println(st.stream().flatMap(e1->e1.getDeptName().stream()).collect(Collectors.toList()));
		
	}
}
