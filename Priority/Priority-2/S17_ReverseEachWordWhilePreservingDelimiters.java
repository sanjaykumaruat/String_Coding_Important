package com.string.Priority2;


public class S17_ReverseEachWordWhilePreservingDelimiters {

    public static void main(String[] args) {

        String str = "yM,emaN,sI.nahK";

        StringBuilder word = new StringBuilder();
        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {

            if (Character.isLetter(ch)) {

                word.append(ch);

            } else {

                result.append(word.reverse());
                word.setLength(0);

                result.append(ch);
            }
        }

        // Last word
        result.append(word.reverse());

        System.out.println("Output : " + result);
    }
}