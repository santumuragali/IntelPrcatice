package com.concepets.java;

public class ThreadCharchter extends Thread{
    @Override
   public void run(){
        System.out.println("charchter printing is started ");
        for(int i=65;i<=75;i++){
            System.out.println((char)i);
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
   }
}
