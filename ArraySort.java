package com.Arrays;

import java.util.Arrays;

public class ArraySort {
	public static void main(String[] args) {
		int a[]= {2,5,4,1,6,3,7};
		Arrays.sort(a);
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+"  ");
		}
		System.out.println();
		System.out.println(Arrays.toString(a));
	}

}
