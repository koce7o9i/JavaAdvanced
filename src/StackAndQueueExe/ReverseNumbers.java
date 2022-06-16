package StackAndQueueExe;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split("\\s+");
        ArrayDeque<Integer> reversedNumbers = new ArrayDeque<>();

        for (String number : numbers) {
            reversedNumbers.push(Integer.valueOf(number));
        }
        for (int i = 0; i < numbers.length; i++) {
            if (i != numbers.length - 1) {
                System.out.print(reversedNumbers.pop() + " ");
            } else {
                System.out.print(reversedNumbers.pop());
            }
        }
    }
}
