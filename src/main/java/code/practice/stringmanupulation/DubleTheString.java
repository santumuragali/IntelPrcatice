package code.practice.stringmanupulation;

import java.util.Scanner;

public class DubleTheString {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String inp = sc.nextLine();
        System.out.println("enter the input of string");
        dobleChar(inp);
        sc.close();
    }
    public static void dobleChar(String str){
        StringBuilder res = new StringBuilder();
        for(char ch : str.toCharArray()){
            res.append(ch).append(ch);
        }
        System.out.println(res);
    }
}
