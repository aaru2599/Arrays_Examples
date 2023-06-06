package com.Arrays;

public class ArraySum {

	int max2Sum(int []arr) {
		int temp=0;
		System.out.print("Given Array: ");
		for(int i=0;i<arr.length;i++) {
			
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
			}
		System.out.print("Array in Ac=scending order: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");

		}
		
		System.out.print("\nsum of 2 largest num: ");
		int sum=(arr[arr.length-1])+(arr[arr.length-2]);
		return sum;

	}
	public static void main(String[] args) {
		ArraySum as= new ArraySum();
		int [] a= {2,4,3,1,6};
		System.out.println(as.max2Sum(a));
	}

}
