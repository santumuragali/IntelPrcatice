package com.concepets.java;

public class Child  extends Parent{

    public Child(String name, int bal) {
        super(name, bal);
    }

    public static void main(String[] args) {
        display();
    }
    public static void display(){
        Child s = new Child("ram",123);
        System.out.println(s.getName());
    }
    void changeData(){


    }
}
