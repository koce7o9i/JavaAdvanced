package DefiningClassesExe.SpeedRacing;

public class Car {
    private String model;
    private double fuelAmount;
    private double fuelConsumption;
    private int distance;

    public Car(String model, double fuelAmount, double fuelConsumption) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelConsumption = fuelConsumption;
        this.distance = 0;
    }

    public double consumption(int kilometers) {
        return fuelConsumption * kilometers;
    }

    public boolean hasEnoughFuel(int kilometers) {
        return fuelAmount >= this.consumption(kilometers);
    }

    public void drive(int kilometers) {
        double fuelNeeded = this.consumption(kilometers);
        if (fuelAmount >= fuelNeeded) {
            this.distance += kilometers;
            this.fuelAmount -= fuelNeeded;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String toString() {
        return String.format("%s %.2f %d", this.model, this.fuelAmount, this.distance);
    }
}
