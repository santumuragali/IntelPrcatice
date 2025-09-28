package com.concepets.java;

public class DameonAdd extends Thread{
    public void run(){
        System.out.println("addition is stared ");
        int a =10;
        int b =2;
        int c = a+b;
        System.out.println(c);
    }
}
