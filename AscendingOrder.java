package com.Arrays;

import java.sql.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class AscendingOrder {
	private static void arrayAscending(int[] arr) {
		int temp=0;
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
		if(arr[i]>arr[j]) {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
			
		}
	}
	
	System.out.println(Arrays.toString(arr));
	
	}
	public static void main(String[] args) {
		int arr[]= {2,5,4,1,6,3,9,7};
		arrayAscending(arr);
	}
	

}
