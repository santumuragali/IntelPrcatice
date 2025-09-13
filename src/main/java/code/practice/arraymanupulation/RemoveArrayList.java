package code.practice.arraymanupulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> as  = new ArrayList<>();
        as.add(1);
        as.add(2);
        as.add(3);
        as.add(1);
        as.add(3);
        as.add(1);
        as.add(2);
        as.add(4);
        HashSet<Integer> se = new HashSet<>(as);
        System.out.println(se);
        System.out.println("========================");
        rremoveduplicate();
    }
    public static  void rremoveduplicate(){
        ArrayList li = new ArrayList<>();
        li.add(1);
        li.add(2);
        li.add(1);
        li.add(3);
        li.add(4);
        li.add("ram");
        li.add('c');
        li.add('z');
        li.add('c') ;

        LinkedHashSet set = new LinkedHashSet(li);
        System.out.println(set);




    }
}
