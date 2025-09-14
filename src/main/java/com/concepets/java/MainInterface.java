package com.concepets.java;

public class MainInterface {

    public static void main(String[] args) {
        MyCalculator m = new MyCalculator();
        AbstactInterface ab;
        m.add();
        m.sub();
        m.mul();
        System.out.println("---------------------");
        Calculator c;
        c =m;
        c.add();
        c.mul();
    }
}
