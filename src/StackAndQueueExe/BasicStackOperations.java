package StackAndQueueExe;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] commands = scanner.nextLine().split(" ");
        int elementsToPush = Integer.parseInt(commands[0]);
        int elementsToPop = Integer.parseInt(commands[1]);
        int elementsToSearch = Integer.parseInt(commands[2]);
        String[] numbers = scanner.nextLine().split("\\s+");
        ArrayDeque<Integer> numbersStack = new ArrayDeque<>();

        for (int i = 0; i < elementsToPush; i++) {
            numbersStack.push(Integer.valueOf(numbers[i]));
        }
        for (int i = 0; i < elementsToPop; i++) {
            numbersStack.pop();
        }
        if (numbersStack.isEmpty()) {
            System.out.println("0");
        } else if (numbersStack.contains(elementsToSearch)) {
            System.out.println("true");
        } else {
            int smallestElement = Integer.MAX_VALUE;
            for (Integer integer : numbersStack) {
                int currentElement = integer;
                if (smallestElement > currentElement) {
                    smallestElement = currentElement;
                }
            }
            System.out.println(smallestElement);
        }
    }
}
