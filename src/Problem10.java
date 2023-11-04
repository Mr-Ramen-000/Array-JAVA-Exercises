//Exercise 10: Array Frequency Count
//Write a Java program that counts the frequency of each
//element in an array and displays the results.

import java.util.Arrays;
import java.util.HashMap;

public class Problem10 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 5, 2, 1, 5, 3};
        HashMap<Integer, Integer> frequency = new HashMap<>();

        for (int n : arr) {
            if(frequency.containsKey(n)){
                frequency.put(n, frequency.get(n) + 1);
            } else {
                frequency.put(n, 1);
            }
        }
        System.out.println("Array: " + Arrays.toString(arr) + "\n");
        for (int key : frequency.keySet()) {
            System.out.println("The frequency of " + key + " is " + frequency.get(key));
        }
    }
}
