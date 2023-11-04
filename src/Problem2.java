//Exercise 2: Array Average
//Write a Java program that calculates the average of elements in an array of integers.

import java.util.Arrays;

public class Problem2 {
    public static void main(String[] args) {
        int[] arr = {28 , 2, 50, 32, 41, 1, 9, 25};
        int sum = 0;

        for (int n : arr) {
            sum += n;
        }

        float average = (float) sum / arr.length;

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.printf("\nAverage of Array: %.2f\n", average);
    }
}
