package com.concepets.java;

public class MainAbsract {
    public static void main(String[] args) {
        FighterPlane fi =new FighterPlane();
        CargoPlane c = new CargoPlane();
        MainAbstact.permit(fi);
        MainAbstact.permit(c);


    }
}
