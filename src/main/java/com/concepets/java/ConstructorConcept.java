package com.concepets.java;

public class ConstructorConcept {
    String name;
    public ConstructorConcept(String name){
        this.name = name;
        System.out.println(name);
    }
//    public  ConstructorConcept(){
//        this("ram");
//        System.out.println("raja huli");
//    }

    public static void main(String[] args) {
        ConstructorConcept c = new ConstructorConcept();
        System.out.println(c.name1);
        System.out.println(c.age);
        ConstructorConcept c2 = new ConstructorConcept("santu",24);
        System.out.println(c2.getName());
        System.out.println(c2.getAge());
    }
    // constructor overloading
    private  String name1;
    private int age;
    public ConstructorConcept(){
        name1 = "ram";
        age = 23;
    }
    public  ConstructorConcept(String name1,int age){
       this. name1 =name1;
       this. age =age;
    }
    public String getName(){
        return name1;
    }
    public int getAge(){
        return age;
    }
}
