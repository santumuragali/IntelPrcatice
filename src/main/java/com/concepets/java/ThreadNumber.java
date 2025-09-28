package com.concepets.java;

import java.util.Scanner;

public class ThreadNumber extends Thread {

    public void run(){
        System.out.println("number mrthod is started ");
        for(int i =0;i<10;i++){
            System.out.println(i);
            try{
              Thread.sleep(1000);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("number class is complted");
    }
}


