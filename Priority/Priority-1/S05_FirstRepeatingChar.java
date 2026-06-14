package com.string.Priority1;

import java.util.HashSet;
import java.util.Set;

public class S05_FirstRepeatingChar {

	public static void main(String[] args) {
		String str = "sanjy";
		Set<Character> set = new HashSet<>();
		for (char ch : str.toCharArray()) {
			if (set.contains(ch)) {
				System.out.println("first repeating character is :" + ch);
				return;
			} else {
				set.add(ch);

			}
			
		}
		System.out.println("no data found");

	}

}
//first repeating character is :a