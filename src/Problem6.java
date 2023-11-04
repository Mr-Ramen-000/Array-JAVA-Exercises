//Exercise 6: Array Reverse
//Write a Java program that reverses the order of elements in an array.

import java.util.Arrays;

public class Problem6 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int arrSize = arr.length / 2;

        System.out.println("Original Array: " + Arrays.toString(arr));
        for (int i = 1; i < arrSize + 1; i++) {
            int temp = arr[i-1];
            arr[i-1] = arr[arr.length - i];
            arr[arr.length - i] = temp;
        }
        System.out.println("Reverse Array : " + Arrays.toString(arr));
    }
}
