package com.Arrays;
import java.util.Arrays;
public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
		int arr[]=new int [2];
		if(nums.length>2) {
		for(int i=0;i<nums.length;i++)
		{
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]+nums[j]==target) {
					arr[0]=i;
					arr[1]=j;
			break;		
				}
			}

			
		}
		
//		System.out.println(Arrays.toString(arr));
		return arr;
		}
		else {
			arr[0]=0;
			
			arr[1]=1;
			return arr;
		}
		

	}
	public static void main(String[] args) {
		int ar[]= {3,2,4};
		int  target=6;
		int []ret=new TwoSum().twoSum(ar, target);
		System.out.println(Arrays.toString(ret));


	}

}
