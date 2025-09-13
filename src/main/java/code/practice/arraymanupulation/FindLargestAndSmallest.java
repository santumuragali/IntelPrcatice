package code.practice.arraymanupulation;

public class FindLargestAndSmallest {

    public static void main(String[] args) {
        findLargestAndSmallest();
    }
    public static void findLargestAndSmallest(){
        int[] a ={1,3,2,4,7,6,0,8,9,-1};
        int small = a[0];
        int largest =a[0];

        for(int num : a){

            if(small>num){
//                if(num>largest) {
//                largest =small;}
                small = num;
            }
            else if(largest<num){
                largest =num;
            }
        }
        System.out.println(small);
        System.out.println(largest);
    }
}
