//Exercise 11: Unique Elements
//Write a Java program that finds and prints the unique (non-repeated) elements in an array.

import java.util.Arrays;
import java.util.HashMap;

public class Problem11 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4, 5};
        HashMap<Integer, Integer> frequency = new HashMap<>();

        for (int n : arr) {
            if(frequency.containsKey(n)){
                frequency.put(n, frequency.get(n) + 1);
            } else {
                frequency.put(n, 1);
            }
        }
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.print("\nThe Unique Elements of Array: ");
        for (int key : frequency.keySet()) {
            if (frequency.get(key) == 1){
                System.out.print(key + " ");
            }
        }
    }
}
