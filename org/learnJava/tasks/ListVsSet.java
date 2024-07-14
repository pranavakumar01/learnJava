package org.learnJava.tasks;

import java.util.*;

public class ListVsSet {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter numbers");
        String line= sc.nextLine();
        String[] parts = line.split(",");
        List<Integer> list = new LinkedList<>();
        Set<Integer> set = new LinkedHashSet<>();
        for (String part : parts){
            int num = Integer.valueOf(part);
            list.add(num);
            set.add(num);
        }
        System.out.println("contents of list are "+list);
        System.out.println("contents of set are "+set);
    }
}
