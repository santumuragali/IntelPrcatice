package com.concepets.java;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionConcept {
    public static void main(String[] args) {
    ExceptionConcept ex = new ExceptionConcept();
//    ex.exception();
        ex.negativeException();
    }
    public void exception(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the values 0f a");
        int a = sc.nextInt();
        System.out.println("enter the values of b");
        int b = sc.nextInt();
        try{
           int result = a/b;
            System.out.println(result);
        }
        catch(ArithmeticException e){
            e.printStackTrace();
            System.out.println("some problem occured ");
        }

    }
    public void negativeException(){
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the size of array");
            int size = sc.nextInt();
            int[] arr = new int[size];
            System.out.println("enter the element to be stored ");
            int ele = sc.nextInt();
            System.out.println("index of element to be stored ");
            int index = sc.nextInt();
            arr[index] = ele;
            System.out.println(Arrays.toString(arr));
        }
        catch (NegativeArraySizeException e){
            System.out.println("negtive values enterd as array size");
        }
        catch(InputMismatchException e){
            System.out.println("Input missmatched");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("entred array index is out of the bound");
        }
    }
}
