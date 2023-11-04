//Exercise 13: Merge Arrays
//Write a Java program that merges two sorted arrays into a single sorted array.

import java.util.Arrays;

public class Problem13 {
    public static void main(String[] args) {
        int[] firstArr = {1, 1, 2, 3, 4, 4, 5};
        int[] secondArr = {1, 3, 6, 6, 8, 10};
        int[] mergeArray = new int[firstArr.length + secondArr.length];

        for (int i = 0; i < mergeArray.length; i++) {
            if (i < firstArr.length) {
                mergeArray[i] = firstArr[i];
                continue;
            }
            mergeArray[i] = secondArr[i - firstArr.length];
        }

        for (int i = 0; i < mergeArray.length - 1; i++) {
            for (int j = 0; j < mergeArray.length - 1; j++) {
                if (mergeArray[j] > mergeArray[j+1]){
                    int temp = mergeArray[j];
                    mergeArray[j] = mergeArray[j+1];
                    mergeArray[j+1] = temp;
                }
            }
        }
        System.out.println("First Array : " + Arrays.toString(firstArr));
        System.out.println("Second Array: " + Arrays.toString(secondArr));
        System.out.println("\nSorted Merge Array: " + Arrays.toString(mergeArray));
    }
}
