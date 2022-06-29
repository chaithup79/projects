package learn;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class amadeus {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		list.addAll(Arrays.asList("9", "1", "6", "1", "8", "88", "44"));
		
		Iterator<String> itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

		// parseInt(String str) takes input like this..
//		System.out.println(list.stream().mapToInt(Integer::parseInt).filter(t1 -> t1%2==0).sum());

		IntSummaryStatistics summary = list.stream().mapToInt(Integer::parseInt).sorted().summaryStatistics();
//		System.out.println(summary);
		
		  int result1 = Integer.parseInt("1");

		  Integer result2 = Integer.valueOf("1");
		  System.out.println(result1);
		  System.out.println(result2);

//		System.out.println(list.stream().mapToInt(Integer::parseInt).filter(x->x%2!=0).reduce((ans,i)->ans +i ).getAsInt());

//		list.parallelStream().mapToInt(Integer::parseInt).sorted().forEach(t1->System.out.println(t1));
	}
}
