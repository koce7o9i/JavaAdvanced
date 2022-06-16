package StackAndQueueExe;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<Character> openingBrackets = new ArrayDeque<>();
        boolean isBalanced = true;
        for (int i = 0; i < input.length(); i++) {
            char currentBracket = input.charAt(i);
            if (currentBracket == '{' || currentBracket == '[' || currentBracket == '(') {
                openingBrackets.push(currentBracket);
            } else {
                if (openingBrackets.isEmpty()) {
                    isBalanced = false;
                    break;
                }
                char lastOpeningBracket = openingBrackets.pop();
                if (currentBracket == '}' && lastOpeningBracket != '{') {
                    isBalanced = false;
                } else if (currentBracket == ']' && lastOpeningBracket != '[') {
                    isBalanced = false;
                } else if (currentBracket == ')' && lastOpeningBracket != '(') {
                    isBalanced = false;
                }
            }
        }
        if (isBalanced) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
