package com.concepets.java;

public class RunableMain {
    public static void main(String[] args) {
        RunableNum n =new RunableNum();
        RunableSub s = new RunableSub();
        Thread t1 = new Thread(n);
        Thread t2 = new Thread(s);
        t1.start();
        t2.start();

    }
}
