package StackAndQueueExe;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int commands = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < commands; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            int commandType = Integer.parseInt(input[0]);

            switch (commandType) {
                case 1:
                    stack.push(Integer.valueOf(input[1]));
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    int biggestElement = Integer.MIN_VALUE;
                    for (Integer integer : stack) {
                        int currentElement = integer;
                        if (biggestElement < currentElement) {
                            biggestElement = currentElement;
                        }
                    }
                    System.out.println(biggestElement);
                    break;
            }
        }
    }
}
