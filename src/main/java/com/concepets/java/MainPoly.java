package com.concepets.java;

public class MainPoly {
    public static void main(String[] args) {
        PolyCargoPlane cargo = new PolyCargoPlane();
        PolyPassengePlane passenger = new PolyPassengePlane();
        PolyFighterPlane fighter = new PolyFighterPlane();
        cargo.fly();
        passenger.fly();
        fighter.fly();
        System.out.println("--------------------");
        PolyPlane plane;
        plane = cargo;
        plane.fly();
        ((PolyCargoPlane)plane).carryCargo();
        plane = passenger;
        plane.fly();
        //downcasting
        ((PolyPassengePlane)plane).carryPassenger();
        plane =fighter;
        ((PolyFighterPlane)plane).carryFighter();
        plane.fly();

    }
}
