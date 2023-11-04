//Exercise 14: Array Subtraction
//Write a Java program that finds and prints the elements
//in one array that are not present in another array.

import java.util.ArrayList;
import java.util.Arrays;

public class Problem14 {
    public static void main(String[] args) {
        int[] firstArr = {5, 7, 0, 32, 50, 3};
        int[] secondArr = {28, 3, 32, 5, 5};

        System.out.println("First Array : " + Arrays.toString(firstArr));
        System.out.println("Second Array: " + Arrays.toString(secondArr));
        System.out.println("\nElements in First Array not present in Second Array: " + arraySubtraction(firstArr, secondArr));
        System.out.println("Elements in Second Array not present in First Array: " + arraySubtraction(secondArr, firstArr));
    }

    public static ArrayList<Integer> arraySubtraction(int[] arr1, int[] arr2){
        ArrayList<Integer> presentElements = new ArrayList<>();
        ArrayList<Integer> notPresentElements = new ArrayList<>();

        for (int f : arr1) {
            for (int s : arr2) {
                if (f == s && !presentElements.contains(f)) {
                    presentElements.add(f);
                }
            }
        }

        for (int i = 0; i < arr1.length; i++) {
            if (i < arr1.length && !presentElements.contains(arr1[i])){
                notPresentElements.add(arr1[i]);
            }
        }
        return notPresentElements;
    }
}
