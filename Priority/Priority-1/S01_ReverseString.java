package com.string.Priority1;

//Using Two Pointer
public class S01_ReverseString {

    public static void main(String[] args) {

        String str = "hello";

        char[] arr = str.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        System.out.println("Original String : " + str);
        System.out.println("Reversed String : " + new String(arr));
    }
}

//-------------SECOND WAY-------------------
//Using Loop
//public class ReverseString {
//
//    public static void main(String[] args) {
//
//        String str = "hello";
//
//        String reversed = "";
//
//        for (int i = str.length() - 1; i >= 0; i--) {
//            reversed = reversed + str.charAt(i);
//        }
//
//        System.out.println("Original String : " + str);
//        System.out.println("Reversed String : " + reversed);
//    }
//}


