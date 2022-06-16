package MultidimensionalArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dimensions = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[dimensions][dimensions];

        for (int row = 0; row < dimensions; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        int[][] result = new int[dimensions][2];
        for (int index = 0; index < dimensions; index++) {
            System.out.print(matrix[index][index] + " ");
        }
        System.out.println();
        int index = dimensions - 1;
        int secondIndex = 0;
        while (index >= 0) {
            System.out.print(matrix[index][secondIndex] + " ");
            index--;
            secondIndex++;
        }
    }
}
