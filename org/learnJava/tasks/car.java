package org.learnJava.tasks;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class car {
    public static void main(String[] args){
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Vehicle Registration Number (or type 'exit' to finish): ");
            String regno = scanner.nextLine();
            if (regno.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.println("Enter Total Kilometers travelled for " + regno + ": ");
            int odo = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter Total Fuel Consumed for " + regno + ": ");
            int fuel = Integer.parseInt(scanner.nextLine());
            int mileage = odo / fuel;
            linkedHashMap.put(regno, mileage);
        }
        while (true) {
            System.out.println("Enter Vehicle registration number to get mileage (or type 'exit' to finish): ");
            String regno = scanner.nextLine();
            if (regno.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.println((linkedHashMap.containsKey(regno) ? linkedHashMap.get(regno) : "Vehicle not found"));
        }
    }
}
