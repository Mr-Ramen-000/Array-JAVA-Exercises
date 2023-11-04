//Exercise 19: Matrix Multiplication
//Write a Java program that performs matrix multiplication for two 2D arrays.

public class Problem19 {
    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] matrix2 = {
                {6, 5},
                {4, 3},
                {2, 1}
        };
        int m1row = matrix1.length;
        int m2Col = matrix2[0].length;
        int [][] matrixResult = new int[m1row][m2Col];

        for (int i = 0; i < m1row; i++) {
            for (int j = 0; j < m2Col; j++) {
                for (int k = 0; k < matrix1[0].length; k++) {
                    matrixResult[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        System.out.println("Matrix 1:");
        printMatrix(matrix1);
        System.out.println("\nMatrix 2:");
        printMatrix(matrix2);
        System.out.println("\nResult of Matrix Multiplication:");
        printMatrix(matrixResult);
    }

    public static void printMatrix(int[][] matrix){
        for (int[] row : matrix) {
            for (int n: row) {
                System.out.print(n + "\t");
            }
            System.out.println();
        }
    }
}