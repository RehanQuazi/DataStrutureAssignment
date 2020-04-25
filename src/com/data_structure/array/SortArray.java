package com.data_structure.array;

import java.util.Arrays;

public class SortArray {
	static void sortArray(int arr[], int size) {
		int low = 0;
		int high = size - 1;
		int mid = 0, temp = 0;
		while (mid <= high) {
			switch (arr[mid]) {
			case 0: {
				temp = arr[low];
				arr[low] = arr[mid];
				arr[mid] = temp;
				low++;
				mid++;
				break;
			}
			case 1:
				mid++;
				break;
			case 2: {
				temp = arr[mid];
				arr[mid] = arr[high];
				arr[high] = temp;
				high--;
				break;
			}
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 0, 1, 1, 2, 1, 0, 1, 2, 0, 0, 0, 1 };
		int n = arr.length;
		sortArray(arr,n);
		System.out.println(Arrays.toString(arr));
	}

}
