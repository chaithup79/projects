package learn;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

public class amas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> li = Arrays.asList(8, 88, 46, 24, 26, 67);
		List<Integer> li2 = new LinkedList<>();

//		8,88,24,67,46

		IntStream in = li.stream().mapToInt(Integer::intValue).sorted();
//    System.out.println(in);
		Collections.sort(li);
		System.out.println(li);
		int count=0;
		
		
	Iterator<Integer> itr=li.iterator();
	
while(itr.hasNext())
{
	
}
	}

}
