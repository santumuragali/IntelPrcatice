package com.concepets.java;

public class FighterPlane extends  Abstact {

    @Override
    public void takeOff() {
        System.out.println("fighter plane is takeoff");
    }

    @Override
    public void fly() {
        System.out.println("fighter plane is fly");
    }

    @Override
    public String land() {
        System.out.println("fighter plane is land");
        return "";
    }
}
