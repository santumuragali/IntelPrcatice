package com.concepets.java;

public class SingleMain {
    public static void main(String[] args) {
        SingleRun s = new SingleRun();
        Thread t1 = new Thread(s);
        Thread t2 = new Thread(s);
        t1.setName("ADD");
        t2.setName("NUM");
        t1.start();
        t2.start();
    }
}
