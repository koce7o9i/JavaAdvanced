package DefiningClassesExe.RawData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int carsCount = Integer.parseInt(scanner.nextLine());

        List<Car> cars = new ArrayList<>();
        while (carsCount-- > 0) {
            String[] carsInfo = scanner.nextLine().split("\\s+");
            String model = carsInfo[0];

            int engineSpeed = Integer.parseInt(carsInfo[1]);
            int enginePower = Integer.parseInt(carsInfo[2]);
            Engine engine = new Engine(engineSpeed, enginePower);

            int cargoWeight = Integer.parseInt(carsInfo[3]);
            String cargoType = carsInfo[4];
            Cargo cargo = new Cargo(cargoWeight, cargoType);

            List<Tire> tireList = new ArrayList<>();
            for (int i = 5; i < carsInfo.length; i = i + 2) {
                double tirePressure = Double.parseDouble(carsInfo[i]);
                int tireAge = Integer.parseInt(carsInfo[i + 1]);
                Tire tire = new Tire(tirePressure, tireAge);
                tireList.add(tire);
            }

            Car car = new Car(model, engine, cargo, tireList);
            cars.add(car);
        }
        String output = scanner.nextLine();
        if (output.equals("fragile")) {
            cars.stream().filter(car -> car.getCargo().getCargoType().equals("fragile"))
                    .filter(car -> car.getTires().stream().anyMatch(tire -> tire.getTirePressure() < 1))
                    .forEach(car -> System.out.println(car.getModel()));
        } else {
            cars.stream().filter(car -> car.getCargo().getCargoType().equals("flamable"))
                    .filter(car -> car.getEngine().getEnginePower() > 250)
                    .forEach(car -> System.out.println(car.getModel()));
        }
    }
}
