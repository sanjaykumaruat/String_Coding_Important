package com.string.Priority1;

public class S12_RemoveWhiteSpaces {

    public static void main(String[] args) {

        String str = "Java Developer";

        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {

            if (ch != ' ') {
                result.append(ch);
            }
        }

        System.out.println(result);
    }
}