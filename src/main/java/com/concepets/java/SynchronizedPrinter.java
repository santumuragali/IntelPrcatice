package com.concepets.java;

public class SynchronizedPrinter implements Runnable{
   synchronized public  void run(){
        String name = Thread.currentThread().getName();
        System.out.println("Thred is stared");
        for(int i=0;i<3;i++){
            System.out.println(name);
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
