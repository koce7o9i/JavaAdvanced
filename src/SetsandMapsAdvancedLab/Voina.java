package SetsandMapsAdvancedLab;

import java.util.*;
import java.util.stream.Collectors;

public class Voina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> firstPlayersDeck = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));
        Set<Integer> secondPlayersDeck = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));
        int rounds = 0;
        while (!firstPlayersDeck.isEmpty() && !secondPlayersDeck.isEmpty()) {
            rounds++;
            if (rounds == 50) {
                break;
            }
            Iterator<Integer> firstIterator = firstPlayersDeck.iterator();
            int firstPlayerCard = firstIterator.next();
            firstIterator.remove();
            Iterator<Integer> secondIterator = secondPlayersDeck.iterator();
            int secondPlayerCard = secondIterator.next();
            secondIterator.remove();
            if (firstPlayerCard > secondPlayerCard) {
                firstPlayersDeck.add(firstPlayerCard);
                firstPlayersDeck.add(secondPlayerCard);
            } else if (secondPlayerCard > firstPlayerCard) {
                secondPlayersDeck.add(firstPlayerCard);
                secondPlayersDeck.add(secondPlayerCard);
            }

        }
        if (firstPlayersDeck.size() > secondPlayersDeck.size()) {
            System.out.println("First player win!");
        } else if (secondPlayersDeck.size() > firstPlayersDeck.size()) {
            System.out.println("Second player win!");
        } else {
            System.out.println("Draw!");
        }
    }
}
