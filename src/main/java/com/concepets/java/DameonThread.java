package com.concepets.java;

public class DameonThread extends Thread
{
    public void run(){
        for(;;){
            System.out.println("demon thread is stared");
            try{
            Thread.sleep(500);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
