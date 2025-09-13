package code.practice.arraymanupulation;

import java.util.ArrayList;

public class FindFirstAndLast {
    public static void main(String[] args) {
        firstAndLast();
    }
    public static void firstAndLast(){
        ArrayList al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(4);
        al.add(5);
        System.out.println(al);
        System.out.println(al.get(0));
        System.out.println(al.get(al.toArray().length-1));
        System.out.println(al.get(al.size()-1));
    }
}
