package MultidimensionalArraysExe;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dimensions = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int rows = dimensions[0];
        int cols = dimensions[1];
        String[][] matrix = new String[rows][cols];
        fillMatrix(scanner, rows, matrix);
        String command;

        while (!"END".equals(command = scanner.nextLine())) {
            String[] operations = command.split("\\s+");
            if (!operations[0].equals("swap") && operations.length != 5) {
                System.out.println("Invalid input!");
            } else {
                int firstRowSwap = Integer.parseInt(operations[1]);
                int firstColSwap = Integer.parseInt(operations[2]);
                int secondRowSwap = Integer.parseInt(operations[3]);
                int secondColSwap = Integer.parseInt(operations[4]);
                String temp;
                try {
                    temp = matrix[firstRowSwap][firstColSwap];
                    matrix[firstRowSwap][firstColSwap] = matrix[secondRowSwap][secondColSwap];
                    matrix[secondRowSwap][secondColSwap] = temp;
                    printMatrix(rows, cols, matrix);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Invalid input!");
                }
            }
        }
    }

    private static void printMatrix(int rows, int cols, String[][] matrix) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static void fillMatrix(Scanner scanner, int rows, String[][] matrix) {
        for (int row = 0; row < rows; row++) {
            String[] arr = scanner.nextLine().split("\\s+");
            matrix[row] = arr;
        }
    }
}
