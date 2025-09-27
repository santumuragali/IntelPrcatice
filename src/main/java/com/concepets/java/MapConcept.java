package com.concepets.java;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapConcept {
    public static void main(String[] args) {
//        student();
        treemap();
      /*
       Map<Integer,String> map = new HashMap<>();
       map.put(1,"santu");
       map.put(2,"sanu");
       map.put(null,"ram");
       map.put(null,"raam");
        map.put(null,"ram");
       map.put(3,null);
       map.put(4,null);
       map.put(null,"santu");
        System.out.println(map);*/
    }
    public static void student(){
        HashMap<Integer,String> students = new HashMap<>();
        students.put(1,"santu");
        students.put(2,"rahul");
        students.put(3,"rahul m");
        students.put(4,"rahul");
        students.put(5,"Rahul");
        System.out.println("all maped values availble in map "+students);
        System.out.println(students.get(2));
        System.out.println("------------------------");
        //getorDefault
        System.out.println("we will get or defulat values "+students.getOrDefault(10,"the values"));
        System.out.println("containsKey "+students.containsKey(3));
        System.out.println("contains values "+students.containsValue("santu"));
        System.out.println("remove the values from coolection "+students.remove(4));
        System.out.println("some key values is absent the we will put some value "+students.putIfAbsent(3,"sneha"));
        System.out.println("some key is vlaue  "+students.putIfAbsent(7,"rama"));
        System.out.println("we need to replace the first key name"+students.replace(1,"annappa")+students);
        System.out.println("print all key present in map "+students.keySet());
        System.out.println("print all values "+students.values());
        System.out.println("presented all value and key "+students.entrySet());
        System.out.println("map is empty "+students.isEmpty());

    }
    public  static  void treemap(){
        TreeMap<Integer,String> tree =new TreeMap<>();


        tree.put(3,"annappa");
        tree.put(1,"santu");
        tree.put(4,"sam");
        tree.put(2,"santu");
        System.out.println(tree);
        LinkedHashMap<Integer,String> tree1 = new LinkedHashMap<>();
        tree1.put(3,"annappa");
        tree1.put(1,"santu");
        tree1.put(4,"sam");
        tree1.put(2,"santu");
        System.out.println(tree1);
        HashMap<Integer,String> hash = new HashMap<>();

    }
}
