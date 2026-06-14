package com.string.Priority2;

public class S14_ReverseWithoutSpecialCharacters {

    public static void main(String[] args) {

        String str = "a,b$c";

        System.out.println(reverseWithoutSpecialCharacters(str));
    }

    private static String reverseWithoutSpecialCharacters(String str) {

        char[] arr = str.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            if (!Character.isLetter(arr[left])) {

                left++;

            } else if (!Character.isLetter(arr[right])) {

                right--;

            } else {

                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        return new String(arr);
    }
}