package com.Arrays;

public class NoOfElements {
	private static int elementsCount(int[] a) {
		int count=0;
		for(int i=0;i<a.length;i++) {
			count++;
			
		}
		
		return count;
		// TODO Auto-generated method stub

	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		System.out.println("Total Elents in array: "+elementsCount(arr));
	}

}
