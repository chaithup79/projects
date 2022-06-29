package learn;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class infotech {

	
	public static int checkFrequency(List<Integer> list1, int size,int frequency)
	{
		HashMap<String, Integer> hm=new HashMap<>();
		
//		List<Map.Entry<String, Integer> > list =
//	               new LinkedList<Map.Entry<String, Integer> >(hm.entrySet());
		
		Set<String> listOfKeys=hm.keySet();
		
		Iterator it=hm.entrySet().iterator();
		
		
		
		Iterator<Integer> itr=list1.iterator();
		
		while(itr.hasNext())
		{
			int val=itr.next();
			if(hm.containsKey(val))
			{
				hm.put("hehe",hm.get(val)+1);
			}
			else
			{
			hm.put("hehe",1);
			}
		}
		
		
		List<Map.Entry<String, Integer> > list =
	               new LinkedList<Map.Entry<String, Integer> >(hm.entrySet());
		System.out.println(hm);
		System.out.println(list);
		
		
		
		
		
		
		

		
		
		
		
		
		
		return 0;
	}
	
	
	public static void main(String[] args) {
		
		
//		//Input data :
//		1 2 3 4 5 4 4 2 3 1 6 2
//		Frequency - 2
		
		Scanner sc=new Scanner(System.in);
		
		
		int freq=sc.nextInt();
		List<Integer> list=Arrays.asList(1,2,3,4,5,4,4,2,3,1,6,2);
		int len=list.size();
		checkFrequency(list, len,freq);
		
		
		
		
	}
}
