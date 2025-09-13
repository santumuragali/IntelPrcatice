package code.practice.arraymanupulation;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
    int a[] = {1,4,2,5,3,5,3,6,3,2};
    array(a);
    }
    public static void array(int a[]){
        HashSet<Integer> hs = new HashSet<>();
        for(int num : a){
            hs.add(num);
        }
        System.out.println(hs);
    }
}
