package com.Arrays;

public class EvenPisition {
	private static void evenPosition(int[] a) {
	for(int i=0;i<a.length;i=i+2) {
		System.out.print(a[i]+" ");
	}
	}
	public static void main(String[] args) {
		int arr[]= {0,1,2,3,4,5,6};
		evenPosition(arr);
	}

}
