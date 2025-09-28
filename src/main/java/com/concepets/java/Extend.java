package com.concepets.java;

public class Extend {

    public static void main(String[] args) {
    ThreadAddition t1 = new ThreadAddition();
    ThreadCharchter t2 =new ThreadCharchter();
    ThreadNumber t3 =new ThreadNumber();
    t1.start();
    t2.start();
    t3.start();
    }
}
