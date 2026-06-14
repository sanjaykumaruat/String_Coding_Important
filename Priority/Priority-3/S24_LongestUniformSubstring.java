package com.string.Priority3;

public class S24_LongestUniformSubstring {

    public static void main(String[] args) {

        String str = "aaabbccccd";

        System.out.println(getLongestUniformSubstring(str));
    }

    private static String getLongestUniformSubstring(String str) {

        int maxStart = 0;
        int maxLength = 1;

        int currentStart = 0;
        int currentLength = 1;

        for (int i = 1; i < str.length(); i++) {

            if (str.charAt(i) == str.charAt(i - 1)) {

                currentLength++;

            } else {

                if (currentLength > maxLength) {

                    maxLength = currentLength;
                    maxStart = currentStart;
                }

                currentStart = i;
                currentLength = 1;
            }
        }

        // Handle last group
        if (currentLength > maxLength) {

            maxLength = currentLength;
            maxStart = currentStart;
        }

        return str.substring(maxStart, maxStart + maxLength);
    }
}