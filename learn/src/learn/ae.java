package learn;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ae {

	public static void main(String[] args) {
		String str="chaitanyap";
		System.out.println(str.substring(6));
		System.out.println(str.indexOf("chai", 6));
		
		
		
		List<Integer> li=new LinkedList<>();
		List<Integer> list=List.of(1,2,3,4,5,6,7,8);
		li.addAll(list);
		List<Integer> list2=li.stream().map(x->x*x).collect(Collectors.toList());
		
		System.out.println(list2);
	}
	
	
	
	
	
}
