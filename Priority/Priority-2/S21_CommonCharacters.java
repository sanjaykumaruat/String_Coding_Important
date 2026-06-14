package com.string.Priority2;

import java.util.HashSet;
import java.util.Set;

public class S21_CommonCharacters {

    public static void main(String[] args) {

        String str1 = "developer";
        String str2 = "programmer";

        Set<Character> set1 = new HashSet<>();

        for (char ch : str1.toCharArray()) {
            set1.add(ch);
        }

        Set<Character> common = new HashSet<>();

        for (char ch : str2.toCharArray()) {

            if (set1.contains(ch)) {
                common.add(ch);
            }
        }

        System.out.println(common);
    }
}