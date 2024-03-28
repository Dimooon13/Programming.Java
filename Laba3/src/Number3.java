import java.util.Arrays;

public class Number3 {
    public static void main(String[] args) {
        int[][] matrix = {
                {5, -2, 9},
                {1, 7, 4},
                {3, 8, -6}
        };

        System.out.println("Матрица до сортировки:");
        printMatrix(matrix);

        sortRows(matrix);

        System.out.println("\nМатрица после сортировки:");
        printMatrix(matrix);
    }

    public static void sortRows(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            Arrays.sort(matrix[i]);
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}