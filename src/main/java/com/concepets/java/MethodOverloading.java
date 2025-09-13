package com.concepets.java;

public class MethodOverloading {
    /**
     * A methodOverlodaing : A multiple method are availble in
     * @param args
     */
    public static void main(String[] args) {
    add(1,2);
    add(1.2,1.4);

    }
    static int res ;
    public static void add(int a,int b){
        res = a+b;
        System.out.println(res);

    }
    public static void add(double a,double b){
        double c =a+b;
        System.out.println(c+" 1");
    }
    public  static void add(int a,double b){
        double c = a+b;
        System.out.println(c+" 2");
    }
    public static  void  add(int a, long b){
        int c = a+(int)b;
        System.out.println(c+" 3");
    }

    public static int add(int a,int b,int c){
        return a+b+c;
    }
}

