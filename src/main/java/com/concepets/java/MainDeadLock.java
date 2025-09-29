package com.concepets.java;

public class MainDeadLock  implements Runnable{
    String resource1 = "PlayStation";
    String resource2 = "Controler";
    public void run(){
        String name = Thread.currentThread().getName();
        if(name.equals("Rohit")){
            rohitAccquiredResource();
        }
        else{
            vijayAcquiredResources();
        }
    }
    void rohitAccquiredResource(){
        try{
            synchronized (resource1){
                System.out.println("rohit acquired playstation");

                Thread.sleep(1000);
                synchronized (resource2){
                    System.out.println("Rohit acquired remote");
                    Thread.sleep(1000);
                }
            }
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    void vijayAcquiredResources(){
        try{
            synchronized (resource1) {
                System.out.println("vijay acquired playstation");
                Thread.sleep(1000);

                synchronized (resource2) {
                    System.out.println("vijay acquired remote");
                    Thread.sleep(1000);
                }
            }

        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }

}
