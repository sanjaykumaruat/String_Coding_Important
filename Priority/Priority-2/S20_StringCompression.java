package com.string.Priority2;


public class S20_StringCompression {

    public static void main(String[] args) {

        String str = "aaabbcccc";

        System.out.println(compress(str));
    }

    private static String compress(String str) {

        StringBuilder result = new StringBuilder();

        int count = 1;

        for (int i = 1; i < str.length(); i++) {

            if (str.charAt(i) == str.charAt(i - 1)) {

                count++;

            } else {

                result.append(str.charAt(i - 1))
                      .append(count);

                count = 1;
            }
        }

        // Handle last character group
        result.append(str.charAt(str.length() - 1))
              .append(count);

        return result.toString();
    }
}