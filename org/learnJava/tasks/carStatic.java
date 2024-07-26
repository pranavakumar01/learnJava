package org.learnJava.tasks;

public class carStatic {
    private static int totalVehicles = 0;
    private String regno;
    private double odo;
    private double fuel;

    public carStatic(String registrationNumber, double kilometersTravelled, double fuelConsumed) {
        this.regno = registrationNumber;
        this.odo = kilometersTravelled;
        this.fuel = fuelConsumed;
        totalVehicles++;
    }
    public static double calculateMileage(double kilometersTravelled, double fuelConsumed) {
        if (fuelConsumed != 0) {
            return kilometersTravelled / fuelConsumed;
        } else {
            return 0;
        }
    }
    public static int getTotalVehicles() {
        return totalVehicles;
    }
    public static void main(String[] args) {
        carStatic vehicle1 = new carStatic("KA21Z3871", 500, 40);
        carStatic vehicle2 = new carStatic("KA19HD5639", 600, 10);
        System.out.println("Mileage of vehicle1: " + carStatic.calculateMileage(vehicle1.odo, vehicle1.fuel));
        System.out.println("Mileage of vehicle2: " + carStatic.calculateMileage(vehicle2.odo, vehicle2.fuel));
        System.out.println("Total number of cars: " + carStatic.getTotalVehicles());
    }
}
