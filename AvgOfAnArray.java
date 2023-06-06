package com.Arrays;

import java.util.Scanner;

public class AvgOfAnArray {

	double avg(int arr[]) {
		double avgValue=0;
		int sum=0;
		for (int i=0;i<arr.length;i++) {
		sum= sum+arr[i];
		avgValue=sum/arr.length;
		}
		return avgValue;
		
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
		sc.close();
		AvgOfAnArray ar= new AvgOfAnArray();
		System.out.println(ar.avg(a));
	}
	}
