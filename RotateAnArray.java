package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RotateAnArray {
	int[] rotateLeft(int[] nums) {
		Scanner sc= new Scanner(System.in);
		System.out.println("How many times you want to sift:");
		int n=sc.nextInt();

		for(int i=1;i<n;i++) {
			int left=nums[0];
			int j;
			for( j=0;j<nums.length-1;j++) {
				nums[j]=nums[j+1];	
			}
			nums[j]=left;
			
		}
		
		
		return nums;
		

	}
	public static void main(String[] args) {
		RotateAnArray ra= new RotateAnArray();
		int []arr= {1,2,3,4,5,6,7,8};
		
		System.out.println(Arrays.toString(ra.rotateLeft(arr)));
	}

}
