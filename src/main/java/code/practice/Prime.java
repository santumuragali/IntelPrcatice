package code.practice;

public class Prime {
    public static void main(String[] args) {
       int num =10;
        if(prime(num)){

            System.out.println("the given number is prime"+num);
        }
        else {
            System.out.println("the number is not prime "+num);
        }
    }
    public static boolean prime(int num){
        if(num==1){
            return false;
        }
       for(int i=2;i<num/2;i++){
           if(num%i ==0){
               return false;
           }
        }
        return  true;
    }
}
