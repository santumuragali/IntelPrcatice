package com.concepets.java;

public class Encapsulation {
    public static void main(String[] args) {
        Encapsulation e = new Encapsulation();
        e.setBal(10000);
        int bal =e.getBal();
        System.out.println(bal
        );

    }
    private int bal;
    public void setBal(int bal){
        this.bal =bal;
    }
    public  int getBal(){
        return bal;
    }
}
