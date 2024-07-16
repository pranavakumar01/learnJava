package org.learnJava.tasks;

import java.util.HashMap;

public class Map {
    public static void main(String[] args){
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("virat",new Integer(18));
        map.put("rohit",new Integer(45));
        map.put("rahul",new Integer(01));
        map.put("thala",new Integer(07));
        System.out.println("Map elements are: "+map);
    }
}
