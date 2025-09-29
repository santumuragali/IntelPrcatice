package com.concepets.java;

public class RuntimeError {
    public static void main(String[] args) {
        RuntimeError r = new RuntimeError();
        r.outofbound();
    }
    public void fun1(){
        fun1();
    }
    public  void outofbound(){
        int size =Integer.MAX_VALUE;
        System.out.println(size);
        int[] arr = new int[size];
    }
}
