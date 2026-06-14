package com.string.Priority1;

public class S02_PalindromeCheck {

    public static void main(String[] args) {

        String str = "madam";

        if (isPalindromeUsingTwoPointer(str)) {
            System.out.println(str + " is a Palindrome");
        } else {
            System.out.println(str + " is Not a Palindrome");
        }
    }

    private static boolean isPalindromeUsingTwoPointer(String str) {

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {

            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}

//---------second way package com.string.Priority1;

//public class S02_PalindromeCheck {
//
//    public static void main(String[] args) {
//
//        String str = "madam";
//
//        String reverse = "";
//
//        for (int i = str.length() - 1; i >= 0; i--) {
//            reverse += str.charAt(i);
//        }
//
//        if (str.equals(reverse)) {
//            System.out.println(str + " is a Palindrome");
//        } else {
//            System.out.println(str + " is Not a Palindrome");
//        }
//    }
//}