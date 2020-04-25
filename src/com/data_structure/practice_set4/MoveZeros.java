package com.data_structure.practice_set4;

import java.util.Arrays;

public class MoveZeros {
	
	static void moveZeros(int arr[]) {
		
		int index=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arr[index]=arr[i];
				index++;
			}
		}
		while(index<arr.length) {
			arr[index]=0;
			index++;
		}
	}
	
	public static void main(String[] args) {
		int arr[]= {12,0,0,34,5,40,0,5};
		moveZeros(arr);
		System.out.println(Arrays.toString(arr));
	}

}

