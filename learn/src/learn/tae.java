package learn;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class tae {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> list1 = new LinkedList<>();
		List<Integer> list2 = new LinkedList<>();
		List<Integer> l1=List.of(1,2,3,4);
		list1.add(l1);
		int arr[]= {1,2,3,4,1,2,3,4,1,1,2,3,4,1,1,2,3,4};
		
		String s="heyyyyaa";
		
		HashMap<Integer,Integer> hm=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			if(hm.containsKey(arr[i]))
			{
				hm.put(arr[i], hm.get(arr[i])+1);
			}
			else
			{
				hm.put(arr[i], 1);
			}
		}
		
		
		System.out.println(hm);
String name = "heyya";
char ch[]=s.toCharArray();
char c2[]= {'h','e','h','e'};
System.out.println(ch);
HashMap<Character, Integer> hm1= new HashMap<>();
for(char c: ch)
{
	if(hm1.containsKey(c))
	{
	hm1.put(c, hm1.get(c)+1);
	}
	else
	{
		hm1.put(c, 1);
	}
}
System.out.println(hm1);
System.out.println(name.valueOf(c2));
	}
}
