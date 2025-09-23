package com.concepets.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorConcept {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("selenium");
        al.add("java");
        al.add("cucumber");
        al.add("rest assured");
         ArrayList<String> al1 = new ArrayList<>();
        al1.add("ram");
        al1.add("sanr");
        System.out.println(al);
//       Iterator<String> it =al.iterator();
//       while (it.hasNext()){
//           String element  = it.next();
//           if(element.equals("java")){
//               it.remove();
//           }
//       }
//        System.out.println(al);
//       Iterator<String> itr = al1.iterator();
//       while (itr.hasNext()){
//           System.out.println(itr.toString());
//           String el =itr.next();
//           System.out.println(el+" elem");
//       }
       //listIterator
        ListIterator<String> list = al.listIterator();
       //forword travesing
        System.out.println("forward travesring");
        while (list.hasNext()){
            System.out.println(list.next());
        }
        System.out.println("backward traversing ");
        while(list.hasPrevious()){
            System.out.println(list.previous());
        }
        System.out.println("modifing lis ");
        while(list.hasNext()){
            String ele = list.next();
            if(ele.equals("java")){
                list.set("play writhe");
            }
            if(ele.equals("cucumber")){
                list.add("python");
            }
            if(ele.equals("rest assured")){
                list.remove();
            }
        }
        System.out.println(al);
    }
}
