package com.concepets.java;

import java.util.Scanner;

public class ArrayConcept {
    public static void main(String[] args) {
//        student();
        //studentJagged();
        dimension();
    }

    /** array conecpet
     * Regular Array : Same number of columns
     * Jagged Array : Unequal number of columns
     * int[] varible_name = new int[size];
     */
    //accessing array element
    public static void array1(){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        for(int i =0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        for(int i =0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
    }
    public static void student(){
        int[][][] student = new int[2][3][5];
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<2;i++){
            for(int j =0; j<3;j++){
                for(int k =0;k<5;k++){
                    student[i][j][k] = sc.nextInt();
                }
                System.out.println("one line complted ");
            }
        }
        for(int i =0;i<2;i++){
            for(int j =0 ;j<3;j++){
                for(int k =0;k<5;k++){
                    System.out.print( student[i][j][k] +" ");
                }
                System.out.println();
            }
            System.out.println("one line complted ");
        }
    }
    /* jagged array */
    public static void studentJagged(){
        int[][]  age = new int[2][];
        age[0] = new int[3];
        age[1] = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<age.length;i++){
            for(int j =0;j<age[i].length;j++) {
                System.out.println("enter student class room " + i + " age of student " + j);
                age[i][j] = sc.nextInt();
            }
        }
        for(int i =0;i<age.length;i++){
            for(int j =0;j<age[i].length;j++){
                System.out.print(  age[i][j]+ " ");
           }
            System.out.println();
        }

    }
    public static void dimension() {
        int[][][] a = new int[2][][];
        a[0] = new int[3][];
        a[1] = new int[2][];
        a[0][0] = new int[2];
        a[0][1] = new int[3];
        a[0][2] = new int[2];
        a[1][0] = new int[2];
        a[1][1] = new int[3];
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<a.length;i++){
            for(int j =0;j<a[i].length;j++){
                for(int k =0;k<a[i][j].length;k++){
                    System.out.println("The scholl "+i+" "+"calsses of "+j+" "+" students "+k);
                    a[i][j][k] = sc.nextInt();
                }
                System.out.println("next line");
            }
        }
        for(int i =0;i<a.length;i++){
            for(int j =0;j<a[i].length;j++){
                for(int k =0;k<a[i][j].length;k++){
                    System.out.print(a[i][j][k]+" " );
                }
                System.out.println();
            }
        }
    }

}
