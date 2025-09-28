package com.concepets.java;

import java.util.Scanner;

public class MultiThreading {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of a");
        int a =sc.nextInt();
        System.out.println("enter the number of b");
        int b = sc.nextInt();
        int c =a+b;
        System.out.println(c);
        System.out.println("charcter is printing ");
        for(int i=65;i<=75;i++){
            System.out.println((char)i);
            Thread.sleep(1000);
        }
        System.out.println("Number is  is printing ");
        for(int i =0;i<=10;i++){
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
}
