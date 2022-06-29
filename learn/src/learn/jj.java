package learn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
//import java.util.List;
//import java.util.Scanner;
import java.util.stream.Collectors;

public class jj {

	public static void main(String[] args) throws IOException
	{
 HashMap<Character, Integer> hm=new HashMap<>();
 int a[][]={ { 1, 2 }, { 3, 4 } };
 System.out.println(a.length);
 System.out.println(a[0].length);
 LinkedList<Integer> ll = new LinkedList<Integer>();
 ll.add(8);
 ll.add(4);
 System.out.println(ll.stream().filter(l->l.equals(8)).collect(Collectors.toList()));
 String str= "Heyya";
 int length= str.length();
 for(int i=0;i<length;i++)
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
 System.out.println(hm);
 
 cc hehe=new cc();
// ((gg)hehe).hello();
 
 
	}
	
}