//Exercise 12: Array Intersection Count
//Write a Java program that finds the number of elements that are
//common in two arrays (intersection count) without duplicating the count for repeated elements.

import java.util.ArrayList;
import java.util.Arrays;

public class Problem12 {
    public static void main(String[] args) {
        int[] firstArr = {5, 7, 0, 32, 32, 3};
        int[] secondArr = {28, 3, 32, 5, 5};
        ArrayList<Integer> intersectionElements = new ArrayList<>();

        for (int f : firstArr) {
            for (int s : secondArr) {
                if (f == s && !intersectionElements.contains(f)) {
                    intersectionElements.add(f);
                }
            }
        }
        System.out.println("First Array : " + Arrays.toString(firstArr));
        System.out.println("Second Array: " + Arrays.toString(secondArr));
        System.out.println("\nUnique intersection elements : " + intersectionElements);
        System.out.println("Number of unique intersection: " + intersectionElements.size());
    }
}
