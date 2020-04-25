package com.data_structure.string;

import java.util.HashMap;

public class FirstUniqueChar {
	
static Character firstUniqueChar(String str) {
		
		HashMap<Character,Integer> content=new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++) {
			char chr=str.charAt(i);
			content.put(chr,content.getOrDefault(chr,0)+1);
			
		}
		
		for(char c:str.toCharArray()) {
			if(content.get(c)==1)
             return c;
		}
		return null;
	}
	
	public static void main(String[] args) {
		
		String str="there is bravery in Being Soft";
		System.out.println("First Non Repeating charcter  : "+firstUniqueChar(str));
	}
}
