package com.Arrays;

import java.util.Scanner;

public class DeleteAnElement {

	void delete(int[] a,int e) {

		for(int i=0;i<a.length;i++) {
			
			if(a[i]==e) {
				for(int j=i;j<a.length-1;j++) {
					a[j]=a[j+1];
				}
				break;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Aray size: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter Array Elements: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the Element which you want to delete: ");
		int b=sc.nextInt();
		sc.close();

		DeleteAnElement de= new DeleteAnElement();
		de.delete(arr, b);
		for(int i=0;i<n-1;i++) {
			System.out.println(arr[i]);
		}
	}
	

}