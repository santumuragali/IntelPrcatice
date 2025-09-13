package code.practice.arraymanupulation;

public class MissingNumberInArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,6};
        System.out.println(missing(a));
    }
    public  static int missing(int[] a){
        int sum =0;
        int res =0;
        int actuallength = a.length;System.out.println(actuallength);
        int expected = actuallength+1;
        System.out.println(expected);
        int expectedsum = expected *(expected+1)/2;
        for(int i=0;i<actuallength;i++){
            sum =sum+a[i];
        }
        System.out.println(expectedsum);
        System.out.println(sum);
        res = expectedsum-sum;

        return res;
    }
}
