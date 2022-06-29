package learn;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class hh {

	public static void main(String[] args) {
		
		
	    HashMap<Character, Integer> hm=new HashMap<>();
	    String str="aabccadeefgghhhhh";
	    
	    for(int i=0;i<str.length();i++)
	    {
	    	if(hm.containsKey(str.charAt(i)))
	    	{
	    		hm.put(str.charAt(i),hm.get(str.charAt(i))+1);
	    	}
	    	else
	    	{
	    		hm.put(str.charAt(i), 1);
	    	}
	    }
	    
	    List<Map.Entry<Character, Integer>> list1=new LinkedList<>(hm.entrySet());
	    Collections.sort(list1, (i1,i2)->i1.getValue().compareTo(i2.getValue()));
	    
	    System.out.println(list1);
	    
	    
		List<String> list=new LinkedList<>();
		List<String> li=List.of("abc","lmn","pqr");
		list.addAll(li);
		list.stream().map(x->x).forEach(y->System.out.println(y));
		
	}
}
