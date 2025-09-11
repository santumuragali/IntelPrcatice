package code.practice.numbermanupulation;

public class Palindrome {
    public static void main(String[] args) {
        palindrome(1110);
    }
    public static void palindrome(int num){

        int temp = num;
        int res =0;
        while(num>0){
            int rem =num %10;
            res = res*10 +rem;
            num =num/10;

        }
        System.out.println(res);
        if(temp == res){
            System.out.println("The given number is palindrome "+temp);
        }
        else{
            System.out.println("The given number is not palindrome "+temp);
        }

    }
}
