package com.concepets.java;

public class StringConcepet {
    public static void main(String[] args) {
//        String s1 ="Java";
//        String s2 = "Java";
//        String s3 = new String("Java");
//        if(s1 == s3){
//            System.out.println("reference is  equals");
//        }
//        else{
//            System.out.println("reference is not equal");
//        }
//        if(s1.equals(s3)){
//            System.out.println("values are equal");
//        }
//        method();
        builtinMethod();
    }
    public static void method(){
        /**
         * concattaion is happen between litteral means reference will not create if values are same
         * concatation is hapen between refernce means new refernce will crate
         *
         */
        String s1 = "santu";
        String s2 ="muragali";
        String s3 = "santu"+"muragali";
        String s4 = "santu"+"muragali";
        String s5 = s1+s2;
        String s6 = s1+s2;

        if(s3 == s4){
            System.out.println("refernce are equal");
        }
        else {
            System.out.println("reference are not equal");
        }
        if(s3.equals(s4)){
            System.out.println("values are equal");
        }
        if(s5==s6){
            System.out.println("reference are equal");
        }
        else {
            System.out.println("reference are not equal");
        }
    }
    public  static  void builtinMethod(){
        String s ="santu";
        System.out.println(s.length());
        System.out.println(s.replace('a','s'));
        System.out.println(s.substring(0,3));
        System.out.println(s.substring(3));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.trim());
        System.out.println(s.lastIndexOf('a'));
        System.out.println(s.indexOf('t'));

    }
}
