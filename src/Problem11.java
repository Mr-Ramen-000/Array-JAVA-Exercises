//Exercise 11: Unique Elements
//Write a Java program that finds and prints the unique (non-repeated) elements in an array.

import java.util.ArrayList;
import java.util.Arrays;

public class Problem11 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 5, 2, 1, 5, 3};
        ArrayList<Integer> uniqueElements = new ArrayList<>();

        for (int n : arr) {
            if(!uniqueElements.contains(n)){
                uniqueElements.add(n);
            }
        }
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("\nThe Unique Elements of Array: " + uniqueElements);
    }
}
