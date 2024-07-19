package org.learnJava.tasks;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class StudentMarks {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter student name (or type 'exit' to finish): ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.println("Enter marks for " + name + ": ");
            int marks = Integer.parseInt(scanner.nextLine());
            hashMap.put(name, marks);
            linkedHashMap.put(name, marks);
            treeMap.put(name, marks);
        }
        while (true) {
            System.out.println("Enter student name to get marks (or type 'exit' to finish): ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.println("Using HashMap: " + (hashMap.containsKey(name) ? hashMap.get(name) : "Student not found"));
            System.out.println("Using LinkedHashMap: " + (linkedHashMap.containsKey(name) ? linkedHashMap.get(name) : "Student not found"));
            System.out.println("Using TreeMap: " + (treeMap.containsKey(name) ? treeMap.get(name) : "Student not found"));
        }

        scanner.close();
    }
}
