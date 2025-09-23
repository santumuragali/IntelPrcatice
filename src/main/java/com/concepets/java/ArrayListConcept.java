package com.concepets.java;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListConcept {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        LinkedList li =new LinkedList();
        al.add("santu");
        al.add("python");
        al.add("java");
        al.add(2);
        al.add('c');
//        al.add(3,"new");
        System.out.println("These will "+al);
//        li.add(al);
//        System.out.println(li);
//        System.out.println("-------------");
//        li.addAll(4,al);
        System.out.println("li st get index value is "+al.get(2));
        System.out.println("Index u wsant "+al.indexOf("Santu"));
        System.out.println("if you want remove the element "+al.remove(2));
        System.out.println(al);
        System.out.println(al.set(2,"ram"));
        System.out.println(al);
    }
}
