package code.practice.stringmanupulation;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        System.out.println("finally we found reverse string ------");
        Scanner sc  = new Scanner(System.in);
        String input =  sc.nextLine();
        System.out.println("The given String is "+input);
        System.out.println("-------------------");
        System.out.println("The reverse string is "+reverse(input));
    }
    public  static String  reverse(String input){
        String rev = "";
        for(char ch : input.toCharArray()) {
            rev = ch + rev;
        }
        return rev;
    }
}
