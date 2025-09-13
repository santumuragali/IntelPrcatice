package code.practice.arraymanupulation;

public class TargetElement {
    public static void main(String[] args) {
        System.out.println( target());

    }
    public static int target(){
        int[] a = {1,2,4,3,5,6,7,9,5};
        int target =10;
        for(int i =0;i<a.length;i++){
            if(a[i] == target){
                System.out.println(i);
                return i;
            }
        }
        return -1;
    }
}
