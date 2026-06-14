package com.string.Priority2;

public class S22_CapitalizeEachWord {

    public static void main(String[] args) {

        String str = "my name is khan";

        String[] words = str.split(" ");

        StringBuilder result = new StringBuilder();

        for (String word : words) {

            result.append(
                    Character.toUpperCase(word.charAt(0)))
                  .append(word.substring(1))
                  .append(" ");
        }

        System.out.println(result.toString().trim());
    }
}