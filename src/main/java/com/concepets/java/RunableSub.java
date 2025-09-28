package com.concepets.java;

import java.util.Scanner;

public class RunableSub implements Runnable {
    public  void run(){
        Scanner sc = new Scanner(System.in);
        System.out.println("The substraction is started");
        System.out.println("Enter number a");
        int a =sc.nextInt();
        System.out.println("enter the number of b");
        int b = sc.nextInt();
        int sub =a-b;
        System.out.println(sub);
    }
}
