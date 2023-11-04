//Exercise 5: Array Copy
//Write a Java program that copies the contents of one array into another array of the same size.

import java.util.Arrays;

    public class Problem5 {
        public static void main(String[] args) {
            int[] orgArr = {28 , 2, 50, 32, 41, 1, 9, 25};
            int[] copyArr = new int[orgArr.length];

            for (int i = 0; i < orgArr.length; i++) {
                copyArr[i] = orgArr[i];
            }
            System.out.println("Original Array: " + Arrays.toString(orgArr));
            System.out.println("Copy Array    : " + Arrays.toString(copyArr));
    }
}
