package com.string.Priority1;

import java.util.HashMap;
import java.util.Map;

public class S11_MaximumOccurringCharacter {

    public static void main(String[] args) {

        String str = "success";

        Map<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        char maxChar = '\0';
        int maxCount = 0;

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            if (entry.getValue() > maxCount) {

                maxCount = entry.getValue();
                maxChar = entry.getKey();
            }
        }

        System.out.println(maxChar);
    }
}