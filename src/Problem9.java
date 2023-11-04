//Exercise 9: Array Rotation
//Write a Java program that rotates the elements of
//an array to the right by a specified number of positions.

import java.util.Arrays;

public class Problem9 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = 2;

        System.out.println("Number of positions: " + n);
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("\nRight rotation process:");
        for (int i = 0; i < n; i++) {
            int[] tempArr = new int[arr.length - 1];
            for (int j = 0; j < tempArr.length; j++) {
                tempArr[j] = arr[j];
            }
            arr[0] = arr[arr.length - 1];
            for (int k = 1; k < arr.length; k++) {
                arr[k] = tempArr[k-1];
            }
            System.out.println(Arrays.toString(arr) + " n" + "=" + (i+1));
        }
        System.out.println("\nArray after right rotation:");
        System.out.println(Arrays.toString(arr));
    }
}
