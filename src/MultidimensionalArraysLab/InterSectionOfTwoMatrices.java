package MultidimensionalArraysLab;

import java.util.Scanner;

public class InterSectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        char[][] firstMatrix = new char[rows][cols];
        char[][] secondMatrix = new char[rows][cols];

        readingMatrix(firstMatrix, scanner);
        readingMatrix(secondMatrix, scanner);

        char[][] output = new char[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                char firstElement = firstMatrix[row][col];
                char secondElement = secondMatrix[row][col];
                char fillOutput = firstElement == secondElement ? firstElement : '*';
                output[row][col] = fillOutput;
            }
        }
        for (char[] chars : output) {
            for (char aChar : chars) {
                System.out.print(aChar + " ");
            }
            System.out.println();
        }
    }

    private static void readingMatrix(char[][] matrix, Scanner scanner) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = scanner.nextLine().replaceAll("\\s+", "")
                    .toCharArray();
        }
    }
}
