package learn;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<user> li=new LinkedList<>();
		li.add(new user(1,"abc", Arrays.asList("commerce","computerscience")));
		li.add(new user(2,"def", Arrays.asList("physics","statistics")));
		li.add(new user(3,"lmn", Arrays.asList("arts","chemistry")));
		
//		li.stream().map(l->l.getDept()).forEach(t1->System.out.println(t1));
		li.stream().flatMap(ll->ll.getDept().stream()).forEach(t1->System.out.println(t1));
		
//		System.out.println(li);
		
	}

}
