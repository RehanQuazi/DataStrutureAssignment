package com.data_structure.string;

public class ReverseString {

	static String reverseString(String str) {

		int left = 0, right;
		char[] strChar = str.toCharArray();
		right = str.length() - 1;
		for (left = 0; left < right; left++, right--) {
			char temp = strChar[left];
			strChar[left] = strChar[right];
			strChar[right] = temp;
		}

		return new String(strChar);
	}

	public static void main(String[] args) {

		String str = "Don't Give Up";
		System.out.println(str);
		System.out.println(reverseString(str));
	}

}
