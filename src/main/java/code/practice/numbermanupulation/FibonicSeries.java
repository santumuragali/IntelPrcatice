package code.practice.numbermanupulation;

public class FibonicSeries {

    public static void main(String[] args) {
       int first = 0;
       int second  =1;
        System.out.print(first +" "+second +" ");
       for(int i = 0;i<6;i++){
           int result = first+second;
           first = second;
           second =result;
           System.out.print(result +" ");

       }
    }
}
