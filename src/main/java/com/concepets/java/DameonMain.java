package com.concepets.java;

public class DameonMain {
    public static void main(String[] args) {
        System.out.println("main method started");
        DameonAdd ad =new DameonAdd();
        DameonThread dt = new DameonThread();
      dt.setDaemon(true);
        ad.start();
        dt.start();
        System.out.println("main mrthod is terminted ");
    }
}
