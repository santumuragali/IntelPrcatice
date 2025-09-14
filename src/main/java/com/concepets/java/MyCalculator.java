package com.concepets.java;

public class MyCalculator implements  Calculator{

    @Override
    public void add() {
        int a =10;
        int b =20;
        System.out.println(a+b);
    }

    @Override
    public void mul() {
        int a =10;
        int b=5;
        System.out.println(a*b);
    }
    public void sub(){
        int a =5;
        int b= 3;
        System.out.println(a-b);

    }
}
