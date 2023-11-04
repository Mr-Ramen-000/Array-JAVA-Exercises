//Exercise 18: 2D Array Operations
//Create a 2D array and perform operations such as finding the sum
//of elements in each row and column, finding the maximum value, and printing the array.

public class Problem18 {
    public static void main(String[] args) {
        int[][] arr2D = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("2D array:");
        for (int[] row : arr2D) {
            for (int n: row) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
        sumOfEachRow(arr2D);
        sumOfEachColumn(arr2D);
        System.out.println("\nMaximum value in the array: " + getMaxNumber(arr2D));
    }

    public static void sumOfEachRow(int[][] arr2D){
        System.out.println("\nSum of Rows:");
        for (int i = 0; i < arr2D.length; i++) {
            int sum = 0;
            for (int n : arr2D[i]) {
                sum += n;
            }
            System.out.println("Row" + (i+1) +" = " + sum);
        }
    }

    public static void sumOfEachColumn(int[][] arr2D){
        int maxColumnLength = 0;

        System.out.println("\nSum of Column:");
        for (int[] ints : arr2D) {
            if (ints.length > maxColumnLength) {
                maxColumnLength = ints.length;
            }
        }

        for (int i = 0; i < maxColumnLength; i++) {
            int sum = 0;
            for (int[] ints : arr2D) {
                if (i < ints.length) {
                    sum += ints[i];
                }
            }
            System.out.println("Column" + (i+1) +" = " + sum);
        }
    }

    public static int getMaxNumber(int[][] arr2D){
        int max = 0;
        for (int[] row : arr2D) {
            for (int n : row) {
                if (n > max){
                    max = n;
                }
            }
        }
        return max;
    }
}