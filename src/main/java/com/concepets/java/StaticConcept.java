package com.concepets.java;

public class StaticConcept {
    public static void main(String[] args) {

    }
//     static StaticConcept se = new StaticConcept();
    static String name = "santu";
    int roll = 12;
    public void display(){
        System.out.println(name);

    }
    public static void displayStatic(){

        System.out.println(name + " ");
    }
    static{
        int marks =530;
        System.out.println(name + " "+ marks+" ");
    }
    {
        System.out.println("secondd");
    }
}
