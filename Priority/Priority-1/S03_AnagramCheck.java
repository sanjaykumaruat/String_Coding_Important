package com.string.Priority1;

public class S03_AnagramCheck {

    public static void main(String[] args) {

        String str1 = "listen";
        String str2 = "silent";

        if (isAnagram(str1, str2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }

    private static boolean isAnagram(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        int[] count = new int[26];

        for (int i = 0; i < s1.length(); i++) {

            count[s1.charAt(i) - 'a']++;

            count[s2.charAt(i) - 'a']--;
        }

        for (int num : count) {

            if (num != 0) {
                return false;
            }
        }

        return true;
    }
}


//------------second way
//package com.string.Priority1;
//
//import java.util.Arrays;
//
//public class S03_AnagramCheck {
//
//    public static void main(String[] args) {
//
//        String str1 = "listen";
//        String str2 = "silent";
//
//        char[] arr1 = str1.toCharArray();
//        char[] arr2 = str2.toCharArray();
//
//        Arrays.sort(arr1);
//        Arrays.sort(arr2);
//
//        if (Arrays.equals(arr1, arr2)) {
//            System.out.println("Anagram");
//        } else {
//            System.out.println("Not Anagram");
//        }
//    }
//}