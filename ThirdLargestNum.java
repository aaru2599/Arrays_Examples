package com.Arrays;

import java.util.Arrays;

public class ThirdLargestNum {
	private static void thirdLargeNum(int[] a) {
		int temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(a[a.length-2]);
		}

	
	public static void main(String[] args) {
		int a[]= {2,4,5,9,8,7,3};
		thirdLargeNum(a);
	}

}
