package com.coding.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class DisplayAllDuplicatesInSortedOrder {

    public static void main(String args[]){
        int arr[] = {14, 7, 14, 6, 1, 11, 3, 16, 16, 8, 7, 4, 11, 15, 17, 6, 1, 13};
        int n = 18;
        ArrayList<Integer> list = duplicates(arr, n);
        for(int x : list){
            System.out.print(x+" ");
        }


    }

    public static ArrayList<Integer> duplicates(int arr[], int n) {
        ArrayList<Integer> duplicate_nos = new ArrayList<>();
        HashMap<Integer, Integer> duplicate_list = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            if(!duplicate_list.containsKey(arr[i])){
                duplicate_list.put(arr[i], 1);
            }else{
                duplicate_list.put(arr[i], duplicate_list.get(arr[i]) + 1);
            }
        }
        for(int x : duplicate_list.keySet()){
            if(duplicate_list.get(x) > 1){
                duplicate_nos.add(x);
            }
        }
        Collections.sort(duplicate_nos);
        if(duplicate_nos.size() == 0) {
            duplicate_nos.add(-1);
        }
        return duplicate_nos;
    }
}
