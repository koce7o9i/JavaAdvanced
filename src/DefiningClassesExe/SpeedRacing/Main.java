package DefiningClassesExe.SpeedRacing;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int carsCount = Integer.parseInt(scanner.nextLine());
        Map<String, Car> cars = new LinkedHashMap<>();
        while (carsCount-- > 0) {
            String[] data = scanner.nextLine().split("\\s+");

            String model = data[0];
            double fuelAmount = Double.parseDouble(data[1]);
            double fuelConsumption = Double.parseDouble(data[2]);
            Car car = new Car(model, fuelAmount, fuelConsumption);

            cars.put(model, car);
        }

        String input;
        while (!"End".equals(input = scanner.nextLine())) {
            String[] tokens = input.split("\\s+");
            String model = tokens[1];
            int kilometers = Integer.parseInt(tokens[2]);

            Car currentCar = cars.get(model);
            if (!currentCar.hasEnoughFuel(kilometers)) {
                System.out.println("Insufficient fuel for the drive");
            } else {
                currentCar.drive(kilometers);
            }
        }
        cars.values().forEach(System.out::println);
    }
}
