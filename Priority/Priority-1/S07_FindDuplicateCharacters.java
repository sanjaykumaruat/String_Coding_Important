package com.string.Priority1;

import java.util.LinkedHashMap;
import java.util.Map;

public class S07_FindDuplicateCharacters {

    public static void main(String[] args) {

        String str = "programming";

        findDuplicateCharacters(str);
    }

    private static void findDuplicateCharacters(String str) {

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        System.out.println("Duplicate Characters:");

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}