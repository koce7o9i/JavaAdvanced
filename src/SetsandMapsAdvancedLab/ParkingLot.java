package SetsandMapsAdvancedLab;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> parkingLot = new LinkedHashSet<>();

        String[] tokens = scanner.nextLine().split(",\\s+");

        while (!"END".equals(tokens[0])) {
            String directions = tokens[0];
            String registrationPlate = tokens[1];
            if (directions.equals("IN")) {
                parkingLot.add(registrationPlate);
            } else {
                parkingLot.remove(registrationPlate);
            }

            tokens = scanner.nextLine().split(",\\s+");
        }
        if (parkingLot.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            for (String carsPlate : parkingLot) {
                System.out.println(carsPlate);
            }
        }
    }
}
