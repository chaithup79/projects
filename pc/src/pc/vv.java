package pc;

import java.util.HashMap;
import java.util.Stack;

public class vv {

	
	
	public static boolean check(String str)
	{
		
		int length=str.length();
		Stack<Character> stack=new Stack<Character>();
		HashMap<Character, Character> hm=new HashMap<>();
		hm.put(')', '(');
		hm.put(']', '[');
		hm.put('}', '{');
		for(int i=0;i<length;i++)
		{
			if(hm.containsKey(str.charAt(i)) && !stack.isEmpty())
			{
				char ch=stack.pop();
				if(ch!=hm.get(str.charAt(i)))
				{
				return false;
				}
				
			}
			else
			{
				stack.push(str.charAt(i));
			}
		}
		return stack.isEmpty();
		
	}
	
	public static void main(String[] args) {
		
		
		System.out.println(check("[{}]"));
	}
	
	
}
