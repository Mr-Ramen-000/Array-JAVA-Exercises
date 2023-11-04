//Exercise 3: Array Maximum and Minimum
//Write a Java program that finds both the maximum and minimum values in an array of integers.

import java.util.Arrays;

public class Problem3 {
    public static void main(String[] args) {
        int[] arr = {28 , 2, 50, 32, 41, 1, 9, 25};
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
            if (arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("\nMinimum: " + min);
        System.out.println("Maximum: " + max);
    }
}
