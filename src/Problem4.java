//Exercise 4: Array Search
//Write a Java program that searches for a specific element in an array of integers
//and returns its index. If the element is not found, indicate that it's not in the array.

import java.util.Arrays;

public class Problem4 {
    public static void main(String[] args) {
        int[] arr = {28 , 2, 50, 32, 41, 1, 9, 25};
        int find = 50;

        System.out.println("Find Element: " + find);
        System.out.println("Array: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (find == arr[i]){
                System.out.printf("Result: Element %d found at Index %d\n", find, i);
                return;
            }
        }
        System.out.printf("Result: Element %d not found in array\n", find);
    }
}
