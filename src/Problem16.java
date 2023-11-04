//Exercise 16: Array Palindrome
//Write a Java program that checks if an array of integers
//is a palindrome (reads the same forwards and backwards).

import java.util.Arrays;

public class Problem16 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 2, 1};

        System.out.println("Array: " + Arrays.toString(arr) + "\n");
        if (isPalindrome(arr)) {
            System.out.println("Result: Array is Palindrome");
        } else {
            System.out.println("Result: Array is not Palindrome");
        }
    }

    public static boolean isPalindrome(int[] arr){
        for (int i = 1; i < (arr.length / 2) + 1; i++) {
            if (arr[i-1] != arr[arr.length - i]){
                return false;
            }
        }
        return true;
    }
}
