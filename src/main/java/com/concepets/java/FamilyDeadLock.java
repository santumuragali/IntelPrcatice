package com.concepets.java;

public class FamilyDeadLock {
    public static void main(String[] args) {
        MainDeadLock md = new MainDeadLock();
        Thread t1 = new Thread(md);
        Thread t2 = new Thread(md);
        t1.setName("Rohit");
        t2.setName("Vijay");
        t1.start();
        t2.start();

    }
}
