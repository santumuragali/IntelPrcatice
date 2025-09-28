package com.concepets.java;

public class RunableNum implements Runnable{
    public void run(){
        System.out.println("Number method is started in runable");
        for (int i =0;i<10;i++){
            System.out.println(i);

        try{
            Thread.sleep(2000);
        }
        catch (InterruptedException e ){
            e.printStackTrace();
        }}
    }
}
