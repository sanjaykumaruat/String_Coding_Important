package com.string.Priority2;

public class S16_ReverseEachWordInSentence {

    public static void main(String[] args) {

        String str = "My Name Is Khan";

        String[] words = str.split(" ");

        StringBuilder result = new StringBuilder();

        for (String word : words) {

            for (int i = word.length() - 1; i >= 0; i--) {
                result.append(word.charAt(i));
            }

            result.append(" ");
        }

        System.out.println(result.toString().trim());
    }
}