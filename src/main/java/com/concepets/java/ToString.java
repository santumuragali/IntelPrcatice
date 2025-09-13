package com.concepets.java;

public class ToString {
    private String name;
    private int age;

    public ToString(String name ,int age){
        super();
        this.name=name;
        this.age =age;
    }

    public String toString(){
       return "[name = "+name+",age= "+age+"]";
    }
    public static void main(String[] args) {
        ToString ts = new ToString("santu",123);
        System.out.println(ts);
    }
}
