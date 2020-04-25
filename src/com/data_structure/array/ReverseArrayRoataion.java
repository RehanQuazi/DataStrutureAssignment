package com.data_structure.array;

import java.util.Arrays;

public class ReverseArrayRoataion {
	
	public void  rotateArray(int ar[],int n,int k) {
		
		reverseArray(ar,0,k-1);
		reverseArray(ar,k,n-1);
		reverseArray(ar,0,n-1);
		
	
	}

	private void reverseArray(int[] ar, int start, int end) {
		int temp;
		if(start<end)
		{
			temp=ar[start];
			ar[start]=ar[end];
			ar[end]=temp;
			start++;
			end--;
		}
		
	
	}
	public static void main(String[] args) {
		ReverseArrayRoataion revarr=new ReverseArrayRoataion();
		int ar[]= {12,34,56,7,9,45,89,32,78};
		System.out.println(Arrays.toString(ar));
		revarr.rotateArray(ar, ar.length, 3);
		System.out.println(Arrays.toString(ar));
	}
}
