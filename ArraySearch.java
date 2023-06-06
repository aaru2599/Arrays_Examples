package com.Arrays;

import java.util.Scanner;

public class ArraySearch {
	boolean search( int arr[],int newNum) 
	{ 
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==newNum) {
				return true;

			}



		}
		return false;
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
		System.out.println("Array Elements are: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("Enter Any element: ");
		ArraySearch as=new ArraySearch();
		int newNum= sc.nextInt();
		System.out.println(as.search(a, newNum));
	}

	
}