package com.Arrays;

public class BinarySearch {
public static int  binarySearch(int[] arr, int low, int high, int searchNumber) {
	if(high>low) {
		int mid=(low+high)/2;
		if(arr[mid]==searchNumber) {
			return mid;
		}
		if(arr[mid]>searchNumber) {
			return binarySearch(arr, low, mid-1, searchNumber);
		}
		if(arr[mid]<searchNumber) {
			return binarySearch(arr, mid+1, high, searchNumber);
		}
		
		
	}
	return -1;
	
}
public static void main(String[] args) {
	int arr[]= {1,2,3,5,6,7,8,10};
	int low=0;
	int high=arr.length-1;
	int searchNumber=7;
	
	int index=binarySearch(arr,low,high,searchNumber);
	System.out.println("index is: "+index);
}
	

}
