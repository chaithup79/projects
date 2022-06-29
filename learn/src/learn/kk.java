package learn;

import java.util.Scanner;

public class kk {
	
	public static int check(int[] arr, int val,int start, int crazy)
	{
		int len=arr.length;
		
		int mid=len/2;
		if(arr[mid]== val)
		{
			return mid;
	
		}
		

		
		
		for(int i=1;i<len-1;i++)
		{
			
			
		if(arr[i]<arr[i-1] && arr[i]>arr[i+1])
		{
			if(arr[i]>val)
			{
				check(arr,val,0,mid-1);
			}
			else
			{
				check(arr,val,mid,len-1);
			}
		}
		}
		
		return mid;
	}
	
	public static void main(String[] args) {
		
		
		int[] arr= {8,12,16,1,2,3,4,6};
		int i=0;
		int j=(arr.length)-1;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
        int res=check(arr, n,i,j);
        System.out.println(res);
        
	
	}

}
