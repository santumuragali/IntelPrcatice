package code.practice.numbermanupulation;

public class NumberOfDigit {
    public static void main(String[] args) {
        numberOfDigit(1234);
    }
    public  static  void numberOfDigit(int num){
        int count =0;
        while (num>0){
            num =num/10;
            count++;
        }
        System.out.println(count);
    }
}
