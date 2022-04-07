package pc;

import java.util.TreeMap;

public class check {

	public static void val(String s1, String s2)
	{
		
		if(s1.length()== s2.length()) {
		TreeMap<Character, Integer> t1= new TreeMap<Character, Integer>();
		TreeMap<Character, Integer> t2= new TreeMap<Character, Integer>();
		
		for(int i=0;i<s1.length();i++)
		{
			if(t1.containsKey(s1.charAt(i)))
			{
			t1.put(s1.charAt(i), t1.get(s1.charAt(i))+1);
			}
			else {
				t1.put(s1.charAt(i), 1);
			}
		}
		
		for(int j=0;j<s2.length();j++)
		{
			if(t2.containsKey(s2.charAt(j)))
			{
			t2.put(s2.charAt(j), t2.get(s2.charAt(j))+1);
			}
			else {
				t2.put(s2.charAt(j), 1);
			}
			
		}
			if(t1.equals(t2))
			{
				System.out.println("anagram");
			}
			else
			{
				System.out.println("not an anagram");
				return;
			}
			
		
		}
		else
		{
			System.out.println("not an anagram");
			return;
		}
	}
	
	public static void main(String[] args) {
		
		val("hehe","eheh");

	}
}
