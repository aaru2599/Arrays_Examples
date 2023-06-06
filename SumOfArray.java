package com.Arrays;

public class SumOfArray {
	private static int ArraySum(int[] a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		return sum;
		
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
	System.out.println("Sum of an array: "+ArraySum(arr));	
	}

}
