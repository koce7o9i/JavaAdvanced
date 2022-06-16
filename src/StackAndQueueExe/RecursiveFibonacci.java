package StackAndQueueExe;

import java.util.ArrayDeque;
import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        if (n < 2) {
            System.out.println(1);
            return;
        }
        ArrayDeque<Long> stack = new ArrayDeque<>();
        stack.push(0L);
        stack.push(1L);

        for (int i = 1; i <= n; i++) {
            long firstNumber = stack.pop();
            long secondNumber = stack.pop();
            stack.push(firstNumber);
            stack.push(firstNumber + secondNumber);
        }
        System.out.println(stack.peek());
    }
}
