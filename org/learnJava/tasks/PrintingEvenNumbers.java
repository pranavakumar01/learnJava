package org.learnJava.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PrintingEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the list of numbers separated by coma, hit enter once done\n");
        String line = scanner.nextLine();

        String [] parts = line.split(",");
        List<Integer> evenNumbers = new ArrayList<>();

        for (String part : parts){
            try{
                int num = Integer.valueOf(part);
                if (((num & 1) == 0)) {
                    evenNumbers.add(num);
                }
            } catch (NumberFormatException e){
                System.out.println("Got some invalid input "+part+" will ignore it.");
            }
        }

        System.out.println("Even Numbers are : "+evenNumbers);
    }
}