package org.learnJava.tasks;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapDiff {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        Map<String, Integer> treeMap = new TreeMap<>();

        hashMap.put("virat", 18);
        hashMap.put("rohit", 45);
        hashMap.put("rahul", 1);
        hashMap.put("thala", 7);

        linkedHashMap.put("virat", 18);
        linkedHashMap.put("rohit", 45);
        linkedHashMap.put("rahul", 1);
        linkedHashMap.put("thala", 7);

        treeMap.put("virat", 18);
        treeMap.put("rohit", 45);
        treeMap.put("rahul", 1);
        treeMap.put("thala", 7);

        System.out.println("HashMap:");
        printMap(hashMap);

        System.out.println("\nLinkedHashMap:");
        printMap(linkedHashMap);

        System.out.println("\nTreeMap:");
        printMap(treeMap);
    }

    private static void printMap(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
