package MultidimensionalArraysExe;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDiff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[size][size];

        fillMatrix(scanner, size, matrix);
        int primaryDiagSum = 0;
        int secondaryDiagSum = 0;

        diagonalDiff(size, matrix, primaryDiagSum, secondaryDiagSum);
    }

    private static void diagonalDiff(int size, int[][] matrix, int primaryDiagSum, int secondaryDiagSum) {
        int difference;
        for (int row = 0; row < size; row++) {
            primaryDiagSum += matrix[row][row];
        }
        int counter = size - 1;
        for (int col = 0; col < size; col++) {
            secondaryDiagSum += matrix[counter][col];
            counter--;
        }

        if (primaryDiagSum > secondaryDiagSum) {
            difference = primaryDiagSum - secondaryDiagSum;
        } else {
            difference = secondaryDiagSum - primaryDiagSum;
        }
        System.out.println(difference);
    }

    private static void fillMatrix(Scanner scanner, int size, int[][] matrix) {
        for (int row = 0; row < size; row++) {
            int[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[row] = arr;
        }
    }
}
