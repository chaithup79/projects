package learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class gg {


	static {
		System.out.println("hehe");
	}

	gg()
	{
		System.out.println("heyya!");
	}
	
	public void hello() {
		System.out.println("heyya");
	}
	public static void main(String[] args)
	{
		gg g=new gg();
		ArrayList<Integer> al=new ArrayList();
		LinkedList<Integer> ll=new LinkedList();
		al.addAll(Arrays.asList(1,2,3,4));
		ll.addAll(Arrays.asList(1,2,3,4));
		System.out.println(al.contains(1));
		LinkedList<LinkedList<Integer>> list=new LinkedList();
		list.add(ll);
		list.add(ll);
		System.out.println(list);
	
		int a[][]= {{1,0,0},
				{2,1,1},
				{3,4,5}};
		
		
		System.out.println(a.length);
		System.out.println(a[0].length);
		
	}

}
