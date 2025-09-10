package code.practice.numbermanupulation;

public class ReverseNumber {

    public static void main(String[] args) {
        System.out.println(rev(102));
    }
    public static  int rev(int num){
        int rev =0;
        while (num>0){
            int rem = num%10;
            rev = rev*10+rem;
            num =num/10;
        }
        return rev;
    }
}
