package com.data_structure.array;

public class SecondLargest {

	public static void findSecondLargest(int arr[], int n) {

		int first,second;
		first=second=Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			if (arr[i] > first) {
				second = first;
				first = arr[i];
			} else if (arr[i] > second&&arr[i] !=first) {
				second = arr[i];
			}
		}
		System.out.println("Second Largest number "+second);
	}
	
	
	public static void main(String[] args) {
		int arr[]= {43,6,8,23,2,5};
		findSecondLargest(arr, arr.length);
	}

}
