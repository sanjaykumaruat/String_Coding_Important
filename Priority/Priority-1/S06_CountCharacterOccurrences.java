package com.string.Priority1;

import java.util.LinkedHashMap;
import java.util.Map;

public class S06_CountCharacterOccurrences {

    public static void main(String[] args) {

        String str = "banana";

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}