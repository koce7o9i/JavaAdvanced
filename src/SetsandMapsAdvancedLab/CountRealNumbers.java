package SetsandMapsAdvancedLab;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .toArray();
        Map<Double, Integer> occurrences = new LinkedHashMap<>();

        for (double value : numbers) {
            if (!occurrences.containsKey(value)) {
                occurrences.put(value, 1);
            } else {
                occurrences.put(value, occurrences.get(value) + 1);
            }
        }
        for (Double key : occurrences.keySet()) {
            System.out.println(String.format("%.1f -> %d", key, occurrences.get(key)));
        }
    }
}
