package code.practice;

public class Swap {
    public static void main(String[] args) {
    Swap sp = new Swap();
    sp.swap(4,3);
    }
    public void swap(int a,int b){
        a =a+b;
        b =a-b;
        a =a-b;
        System.out.println("swaping first a number is  "+a);
        System.out.println("swaping of second b number is "+b);
    }
}
