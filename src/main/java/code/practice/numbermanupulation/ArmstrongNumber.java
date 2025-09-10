package code.practice.numbermanupulation;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        int temp =num;
        int sum =0;
        while (num>0){
           int rem = num%10;
           sum =sum+rem*rem*rem;
           num =num/10;
        }
        if(temp == sum){
            System.out.println("the given number is amrstrong "+sum);
        }
        else{
            System.out.println("The given number is not armstrong "+sum);
        }
    }
}
