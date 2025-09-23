package com.concepets.java;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class SetConcept {
    public static void main(String[] args) {
        System.out.println("Hash Set");
        HashSet<String> hs = new HashSet<>();
        hs.add("santu");
        hs.add("muragali");
        hs.add("chandrakant");
        hs.add(null);
        hs.add(null);
        hs.add("santu");
        System.out.println(hs);

        LinkedHashSet<String> ll = new LinkedHashSet<>();
        ll.add("santu");
        ll.add("muragali");
        ll.add("qwe");
        ll.add(null);
        ll.add(null);
        System.out.println(ll);
        TreeSet<String> t = new TreeSet<>();
        t.add("santu");
        t.add("muragali");
        t.add("chandu");
//        t.add(null);
        System.out.println(t);
        System.out.println(t.first());
        System.out.println(t.last());
        System.out.println(t.headSet("santu"));
        System.out.println(t.tailSet("muragali"));

    }
}
