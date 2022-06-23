package DefiningClassesExe.CarSalesman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int engineCount = Integer.parseInt(scanner.nextLine());
        List<Engine> engines = new ArrayList<>();

        while (engineCount-- > 0) {
            String[] engineInfo = scanner.nextLine().split("\\s+");
            String engineModel = engineInfo[0];
            int power = Integer.parseInt(engineInfo[1]);
            int displacement = Integer.parseInt(engineInfo[2]);
            if (engineInfo.length > 3) {
                String efficiency = engineInfo[3];
                Engine engine = new Engine(engineModel, power, displacement, efficiency);
                engines.add(engine);
            } else {
                Engine engine = new Engine(engineModel, power, displacement);
                engines.add(engine);
            }
        }

        int carsCount = Integer.parseInt(scanner.nextLine());
        List<Car> cars = new ArrayList<>();

        while (carsCount-- > 0) {
            String[] carsInfo = scanner.nextLine().split("\\s+");
            String carModel = carsInfo[0];
            String carEngine = carsInfo[1];

            switch (carsInfo.length) {
                case 2:

                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
        }
    }
}
