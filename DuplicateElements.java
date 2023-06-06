package com.Arrays;

public class DuplicateElements {
	static int dupElements(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j])
		//			dupl=arr[j];
				return arr[j];
					
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		int a[]=new int [] {1,5,4,6,9,1,5};
		System.out.println(dupElements(a));
	}

}
