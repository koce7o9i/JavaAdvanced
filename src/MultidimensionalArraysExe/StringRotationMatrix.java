package MultidimensionalArraysExe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringRotationMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rotation = scanner.nextLine();
        String input;
        List<String> wordList = new ArrayList<>();
        int wordLenght = Integer.MIN_VALUE;

        while (!"END".equals(input = scanner.nextLine())) {
            wordList.add(input);
            int currentLenght = input.length();
            if (currentLenght > wordLenght) {
                wordLenght = currentLenght;
            }
        }
        int rows = wordList.size();
        int cols = wordLenght;
        char[][] matrix = new char[wordList.size()][wordLenght];
        fillMatrix(rows, cols, matrix, wordList);

        String angleString = rotation.split("[()]")[1];
        int angle = Integer.parseInt(angleString);
        int angleOfRotation = angle % 360;
        printRotatedMatrix(rows, cols, matrix, angleOfRotation);
    }

    private static void printRotatedMatrix(int rows, int cols, char[][] matrix, int angleOfRotation) {
        switch (angleOfRotation) {
            case 0:
                for (int row = 0; row < rows; row++) {
                    for (int col = 0; col < cols; col++) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }
                break;
            case 90:
                for (int col = 0; col < cols; col++) {
                    for (int row = rows - 1; row >= 0; row--) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }
                break;
            case 180:
                for (int row = rows - 1; row >= 0; row--) {
                    for (int col = cols - 1; col >= 0; col--) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }
                break;
            case 270:
                for (int col = cols - 1; col >= 0; col--) {
                    for (int row = 0; row < rows; row++) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }
                break;
        }
    }

    private static void fillMatrix(int rows, int cols, char[][] matrix, List<String> wordList) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (col < wordList.get(row).length()) {
                    char currentChar = wordList.get(row).charAt(col);
                    matrix[row][col] = currentChar;
                } else {
                    matrix[row][col] = ' ';
                }
            }
        }
    }
}
