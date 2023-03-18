package com.coding.concepts;

import java.util.*;

public class ValueBasedSortingInHashmap{

    public static void main(String[] args){
        HashMap<String, Integer> hm  = new HashMap<>();
        hm.put("Random",0);
        hm.put("Rohit",32);
        hm.put("Rani",30);
        hm.put("Jay",1);
        hm.put("Kiara",6);

        System.out.println(hm);

        Set<Map.Entry<String, Integer>> entries = hm.entrySet();

        System.out.println("Set of entries : " + entries);

        LinkedList<Map.Entry<String, Integer>> ll = new LinkedList<>(entries);

        System.out.println("Linked list details : " + ll);

        Collections.sort(ll, new Comparator<Map.Entry<String, Integer>>() {

            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        System.out.println("Sorted Linked list details : " + ll);

        LinkedHashMap<String, Integer> sortedOnValues = new LinkedHashMap<>();

        for(Map.Entry<String, Integer> entry : ll){
            sortedOnValues.put(entry.getKey(), entry.getValue());
        }

        System.out.println("Descending order of the values in the hashmap: " + sortedOnValues);

    }
}
