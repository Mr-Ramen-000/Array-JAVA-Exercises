//Exercise 17: Array Shift
//Write a Java program that shifts the elements of an
//array to the left by a specified number of positions.

import java.util.Arrays;

public class Problem17 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = 2;

        System.out.println("Number of positions: " + n);
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("\nLeft shifts process:");
        for (int i = 0; i < n; i++) {
            int[] tempArr = new int[arr.length - 1];
            for (int j = 1; j <= tempArr.length; j++) {
                tempArr[j - 1] = arr[j];
            }

            arr[arr.length - 1] = arr[0];
            for (int k = 0; k < arr.length - 1; k++) {
                arr[k] = tempArr[k];
            }
            System.out.println(Arrays.toString(arr) + " n" + "=" + (i+1));
        }
        System.out.println("\nArray after left shifts:");
        System.out.println(Arrays.toString(arr));
    }
}