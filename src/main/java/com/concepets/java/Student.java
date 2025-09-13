package com.concepets.java;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        System.out.println("ram");
        int[][] a = new int[2][5];
        System.out.println("Enter the array values");
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<2;i++){
            for(int j=0;j<5;j++){
                a[i][j] = sc.nextInt();
            }
            System.out.println( "----------------------");
        }
        for(int i =0;i<2;i++){
            for(int j=0;j<5;j++){
                System.out.print(a[i][j] +" ");
            }

        }
    }

}
