package com.concepets.java;

import java.util.Scanner;

public class SingleRun implements  Runnable{
    public  void run(){
        System.out.println("main execution is started ");
        Thread t = Thread.currentThread();
        String str = t.getName();
        if(str.equals("ADD")){
            add();
        }
        else if(str.equals("NUM")){
            number();
        }
    }
    public void add(){
        Scanner sc = new Scanner(System.in);
        System.out.println("add operation is started ");
        System.out.println("Enter the number a");
        int a = sc.nextInt();
        System.out.println("enter the number b");
        int b = sc.nextInt();
        int add =a+b;
        System.out.println(add);
        System.out.println("The addition operation is terminated ");
    }
    public void number (){
        System.out.println("The number operation is started ");
        for(int i =0;i<10;i++){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
