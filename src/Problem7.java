//Exercise 7: Array Sorting
//Write a Java program that sorts an array of
//integers in ascending order using a sorting algorithm (e.g., Bubble Sort).

import java.util.Arrays;

public class Problem7 {
    public static void main(String[] args) {
        int[] arr = {28 , 2, 50, 32, 41, 1, 9, 25};

        System.out.println("Original Array: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted Array  : " + Arrays.toString(arr));
    }
}
