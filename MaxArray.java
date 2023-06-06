package com.Arrays;

import java.util.Scanner;

public class MaxArray {
	void max(int arr[]) {
		int maxa=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(maxa<arr[i]) {
				maxa=arr[i];
			}
		}
		System.out.print("Largest element in Array is :"+maxa);
		
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Please Enter Array size");
		int size=sc.nextInt();
		int a []= new int [size];
		System.out.print("Enter your Array elements: ");
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		MaxArray ma= new MaxArray();
		ma.max(a);
		
		
	}

}
