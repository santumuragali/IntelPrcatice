package code.practice;

public class Factorial {
    public static void main(String[] args) {
factorial(5);
    }
    public static  void factorial(int n){
        int res =1;
        for(int i=1;i<=n;i++){
            res = res *i;

        }
        System.out.println("Factorial of given number is "+res);
    }
}
