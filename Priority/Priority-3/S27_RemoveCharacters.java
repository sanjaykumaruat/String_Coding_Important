package com.string.Priority3;

import java.util.HashSet;
import java.util.Set;

public class S27_RemoveCharacters {

    public static void main(String[] args) {

        String str1 = "welcome";
        String str2 = "come";

        Set<Character> removeChars = new HashSet<>();

        for (char ch : str2.toCharArray()) {
            removeChars.add(ch);
        }

        StringBuilder result = new StringBuilder();

        for (char ch : str1.toCharArray()) {

            if (!removeChars.contains(ch)) {
                result.append(ch);
            }
        }

        System.out.println(result);
    }
}