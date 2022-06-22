package SetsandMapsAdvancedLab;

import java.util.*;

public class CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Map<String, List<String>>> mapContinents = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String continent = tokens[0];
            String country = tokens[1];
            String city = tokens[2];

            mapContinents.putIfAbsent(continent, new LinkedHashMap<>());
            Map<String, List<String>> countriesWithCities = mapContinents.get(continent);
            countriesWithCities.putIfAbsent(country, new ArrayList<>());
            List<String> cities = countriesWithCities.get(country);
            cities.add(city);

        }
        mapContinents.entrySet()
                .forEach(entry -> {
                    String continent = entry.getKey();
                    Map<String, List<String>> countryWithCities = entry.getValue();

                    System.out.println(continent + ":");
                    countryWithCities.entrySet()
                            .forEach(e -> {
                                System.out.println("  " + e.getKey() + " -> "
                                        + String.join(", ", e.getValue()));
                            });
                });
    }
}
