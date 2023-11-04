//Exercise 1: Array Sum
//Write a Java program that calculates the sum of all elements in an array of integers.

import java.util.Arrays;

public class Problem1 {
    public static void main(String[] args) {
        int[] arr = {28 , 2, 50, 32, 41, 1, 9, 25};
        int sum = 0;

        for (int n : arr) {
            sum += n;
        }
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("\nSum of Array: " + sum);
    }
}
