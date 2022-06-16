package StackAndQueueExe;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        int elementsToOffer = Integer.parseInt(input[0]);
        int elementsToPoll = Integer.parseInt(input[1]);
        int elementToSearch = Integer.parseInt(input[2]);
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        String[] elements = scanner.nextLine().split("\\s+");

        for (int i = 0; i < elementsToOffer; i++) {
            queue.offer(Integer.valueOf(elements[i]));
        }
        for (int i = 0; i < elementsToPoll; i++) {
            queue.poll();
        }
        if (queue.isEmpty()) {
            System.out.println("0");
        } else if (queue.contains(elementToSearch)) {
            System.out.println("true");
        } else {
            int smallestElement = Integer.MAX_VALUE;
            for (Integer integer : queue) {
                int currentElement = integer;
                if (smallestElement > currentElement) {
                    smallestElement = currentElement;
                }
            }
            System.out.println(smallestElement);
        }
    }
}
