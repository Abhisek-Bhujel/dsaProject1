package Polymorphism.Challenge1;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("2022 Blue Ferrari 296 GTS");
        runRace(car1);

        Car ferrari = new GasPoweredCar("2022 Blue Ferrari 296 GTS",15.4, 8);
        runRace(ferrari);

        Car tesla = new ElectricCar("2022 Red Tesla Model 3",568,75);
        runRace(tesla);

        Car ferrariHybrid = new HybridCar("2022 Black ferrari SF90 Stradale",16,8,8);
        runRace(ferrariHybrid);
    }

    public static void runRace(Car car){
        car.startEngine();
        car.drive();
    }
}
