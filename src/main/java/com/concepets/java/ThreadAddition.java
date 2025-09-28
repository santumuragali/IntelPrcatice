package com.concepets.java;

import java.util.Scanner;

public class ThreadAddition extends Thread {
    public void run(){
        System.out.println("The number execution is started");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which is a");
        int a =sc.nextInt();
        System.out.println("enter the number of b");
        int b =sc.nextInt();
        int res = a+b;
        System.out.println(res);
        System.out.println("additiona activity is completed ");
    }

}
