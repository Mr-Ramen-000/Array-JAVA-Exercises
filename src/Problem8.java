//Exercise 8: Array Intersection
//Write a Java program that finds the
//intersection of two arrays (common elements) and stores them in a new array.

import java.util.Arrays;

public class Problem8 {
    public static void main(String[] args) {
        int[] firstArr = {5, 7, 0, 32, 10};
        int[] secondArr = {28, 32, 5};

        int interSectionSize = 0;
        for (int f : firstArr) {
            for (int s : secondArr) {
                if (f == s) {
                    interSectionSize += 1;
                }
            }
        }

        int index = 0;
        int[] interSection = new int[interSectionSize];
        for (int i = 0; i < firstArr.length ; i++) {
            for (int j = 0; j < secondArr.length; j++) {
                if (firstArr[i] == secondArr[j]){
                    interSection[index] = firstArr[i];
                    index++;
                }
            }
        }
        System.out.println("First Array : " + Arrays.toString(firstArr));
        System.out.println("Second Array: " + Arrays.toString(secondArr));
        System.out.println("Intersection: " + Arrays.toString(interSection));
    }
}
