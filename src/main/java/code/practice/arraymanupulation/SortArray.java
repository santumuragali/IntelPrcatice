package code.practice.arraymanupulation;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] a ={1,2,6,5,3,4};
        int lenght = a.length;
        for(int i =0;i<lenght;i++){
            for(int j =i+1;j<lenght;j++){
                if(a[i]>a[j]){
                    int temp =a[i];
                    a[i] =a[j];
                    a[j] =temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
