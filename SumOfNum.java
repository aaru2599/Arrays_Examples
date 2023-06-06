package com.Arrays;

public class SumOfNum {
	public static void main(String[] args) {
		////		String a="1234";
		//		int sum=0;
		//	int  n= Integer.parseInt(a);
		//	
		//	System.out.println(n);
		//	 
		//	for(int i=0;i<=a.charAt(i);i++) {
		//		
		//		
		//		sum=sum+ch;
		//		System.out.println(sum);
		//	}
		//	
		//	
		int a=123123;
		int sum=0;
		while(a>0)
		{
			int b= a%10;
		 sum=sum+b;
		 a=a/10;
		}
		System.out.println(sum);
	}
}