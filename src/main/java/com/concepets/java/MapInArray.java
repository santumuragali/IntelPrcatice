package com.concepets.java;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapInArray {
    public static void main(String[] args) {
        arrayOfStudet();
    }
    public static void arrayOfStudet(){
        LinkedHashMap<Integer,int[]> li = new LinkedHashMap<>();
        li.put(1,new int[]{23,25,24});
        li.put(2,new int[]{25,26,23});
        li.put(3,new int[]{27,24,25});
        System.out.println(li);
        for(Map.Entry<Integer,int[]> entry:li.entrySet()){
            System.out.println(entry.getKey() + " "+ Arrays.toString(entry.getValue()));
        }
        System.out.println(li.keySet() +" "+ Arrays.toString(li.values().toArray()));
    }
}
