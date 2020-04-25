package com.data_structure.matrix;

public class DignonalSum {
	
	public static void findDigonalSum(int arr[][],int n)
	{
		int principal=0,secondary=0;
		for(int i=0;i<n;i++)
		{
			principal+=arr[i][i];
			secondary+=arr[i][n-i-1];
		}
		
		System.out.println("Principal Sum :"+principal);
		System.out.println("Secondary Sum :"+secondary);
	}
	
	public static void main(String[] args) {
		
		int arr[][]= {{1,2,3,4},{5,6,7,8},{1,2,3,4},{5,6,7,8}};
		findDigonalSum(arr, 4);
		
	}

}
