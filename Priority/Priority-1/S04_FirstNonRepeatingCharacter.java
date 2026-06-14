package com.string.Priority1;

import java.util.HashMap;
import java.util.Map;

public class S04_FirstNonRepeatingCharacter {

    public static void main(String[] args) {

        String str = "programming";

        Map<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : str.toCharArray()) {

            if (map.get(ch) == 1) {
                System.out.println("First Non-Repeating Character : " + ch);
                break;
            }
        }
    }
}