package com.concepets.java;

public class DuctingException {
    public static void main(String[] args) {
    DuctingException d = new DuctingException();
    try{
        d.ducting();
    }
    catch (Exception e ){
        System.out.println("exception handled by mamin");
//        e.printStackTrace();
        System.out.println("======================");
        System.out.println(e.getMessage());
    }
    }
    public void ducting() throws Exception{
        int a =10;
        int b =0;
        int c =a/b;
        System.out.println(c);
        System.out.println("exception handled by methode ");
    }
}
