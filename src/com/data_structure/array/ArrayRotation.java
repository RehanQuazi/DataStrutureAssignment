package com.data_structure.array;

import java.util.Arrays;

public class ArrayRotation {

	public int findGCD(int a, int b) {
		if (b == 0)
			return a;
		else
			return findGCD(b, a % b);
	}

	public void rotateArray(int ar[], int n, int k) {
		
		int d = 0, i = 0, j = 0, temp = 0;
		int gcd = findGCD(n, k);
		for (i = 0; i < gcd; i++) {
			j = i;
			temp = ar[i];
			while (true) {
				d = (j + k) % n;
				if (d == i)
					break;
				ar[j] = ar[d];
				j = d;
			}
			ar[j] = temp;
		}
	}

	public static void main(String[] args) {
		int ar[] = { 12, 34, 56, 7, 9, 45, 89, 32, 78 };
		int len = ar.length;
		ArrayRotation obj = new ArrayRotation();
		System.out.println(Arrays.toString(ar));
		obj.rotateArray(ar, len, 3);
		System.out.println(Arrays.toString(ar));

	}

}
