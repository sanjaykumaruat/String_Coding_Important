package com.string.Priority1;

public class S13_CountVowelsAndConsonants {

    public static void main(String[] args) {

        String str = "sanjay";

        int vowels = 0;
        int consonants = 0;

        str = str.toLowerCase();

        for (char ch : str.toCharArray()) {

            if (Character.isLetter(ch)) {

                if (ch == 'a' || ch == 'e' || ch == 'i'
                        || ch == 'o' || ch == 'u') {

                    vowels++;

                } else {

                    consonants++;
                }
            }
        }

        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);
    }
}