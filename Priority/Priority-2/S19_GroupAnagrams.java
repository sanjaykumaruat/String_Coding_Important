package com.string.Priority2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class S19_GroupAnagrams {

    public static void main(String[] args) {

        String[] words = {
                "eat", "tea", "tan",
                "ate", "nat", "bat"
        };

        Map<String, List<String>> map = new HashMap<>();

        for (String word : words) {

            char[] arr = word.toCharArray();

            Arrays.sort(arr);

            String key = new String(arr);

            map.computeIfAbsent(
                    key,
                    k -> new ArrayList<>())
                    .add(word);
        }

        System.out.println(map.values());
    }
}