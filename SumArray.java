package com.Arrays;

import java.util.Scanner;

public class SumArray {

	int sum(int []b) {
		int sum=0;
		for(int i=0;i<b.length;i++) {
			sum=sum+b[i];}
		System.out.println("Sum of an array:");
		return sum;
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
		SumArray sa= new SumArray();
		System.out.println(sa.sum(a));
				
		
		
	}


}
