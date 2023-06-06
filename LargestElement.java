package com.Arrays;

public class LargestElement {
	private static int largeElement(int[] a) {
		int large=a[0];
		for(int i=0;i<a.length;i++) {
			if(large<a[i]) 
				large=a[i];
			
		}
		//System.out.println(large);
		return large;

	}
	public static void main(String[] args) {
		int arr[]= {2,5,4,6,2,1};
		System.out.println("Large number is: "+largeElement(arr));
	}

}
