package com.concepets.java;

public class CargoPlane extends  Abstact{

    @Override
    public void fly() {
        System.out.println("cargo plane is flying");
    }

    @Override
    public void takeOff() {
        System.out.println("cargo plane is takeop");
    }

    @Override
    public String land() {
        System.out.println("cargo plane is landing");
        return "";
    }
}
