package com.concepets.java;

public class MainSynchrionized {
    public static void main(String[] args) {
        SynchronizedPrinter s = new SynchronizedPrinter();
        Thread t1 =new Thread(s);
        Thread t2 = new Thread(s);
        Thread t3 = new Thread(s);
        t1.setName("Man");
        t2.setName("WOmen");
        t3.setName("child");
        t1.start();
        t2.start();
        t3.start();
    }
}
