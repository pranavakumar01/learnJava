package org.learnJava.tasks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ListVsSet {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter numbers");
        String line= sc.nextLine();
        String[] parts = line.split(",");
        ArrayList<Integer> list = new ArrayList<Integer>();
        Set<Integer> set = new HashSet<>();
        for (String part : parts){
            int num = Integer.valueOf(part);
            list.add(num);
            set.add(num);
        }
        System.out.println("contents of list are "+list);
        System.out.println("contents of set are "+set);
    }
}
