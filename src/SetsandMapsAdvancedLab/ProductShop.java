package SetsandMapsAdvancedLab;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command;
        Map<String, Map<String, Double>> storeInfo = new TreeMap<>();

        while (!"Revision".equals(command = scanner.nextLine())) {
            String[] tokens = command.split(",\\s+");
            String storeName = tokens[0];
            String product = tokens[1];
            Double price = Double.parseDouble(tokens[2]);
            storeInfo.putIfAbsent(storeName, new LinkedHashMap<>());
            Map<String, Double> storesWithProducts = storeInfo.get(storeName);
            storesWithProducts.put(product, price);
        }

        storeInfo.entrySet()
                .forEach(entry -> {
                    String storeName = entry.getKey();
                    Map<String, Double> storeWithProducts = entry.getValue();

                    System.out.println(storeName + "->");
                    storeWithProducts.entrySet()
                            .forEach(e -> {
                                System.out.printf("Product: %s, Price: %.1f%n", e.getKey(), e.getValue());
                            });
                });
    }
}
