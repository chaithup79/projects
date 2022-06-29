package learn;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class bracket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list=Arrays.asList(8,88,9,94);
		Integer sum=list.stream().mapToInt(Integer::intValue).filter(t -> t%2==0).sum();
//		Integer sum2=list.stream().mapToInt(null);
		String st = "[{}]";
		System.out.println(sum);
//		System.out.println(check(st));

//	}
//
//	public static boolean check(String str) {
//		HashMap<Character, Character> hashMap = new HashMap<>();
//		hashMap.put(']', '[');
//		hashMap.put(')', '(');
//		hashMap.put('}', '{');
//		char ch;
//		Stack<Character> stack = new Stack();
//
////		for (int i = 0; i < str.length(); i++) {
////		//	if (str.charAt(i) != ']' && str.charAt(i) != ')' && str.charAt(i) != '}') {
////				stack.push(str.charAt(i));
////		}
//		//	}
//
//		for (int i = 0; i < str.length(); i++) {
//			if (hashMap.containsKey(str.charAt(i)) && !stack.isEmpty()) {
//				ch = stack.pop();
//				if (ch != hashMap.get(str.charAt(i))) {
//					return false;
//				} else {
//					stack.push(str.charAt(i));
//				}
//			}
//		}
//	
//
//		return stack.isEmpty();
//	}
		
		
		
}

}