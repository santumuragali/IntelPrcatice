package code.practice.arraymanupulation;

import java.util.HashSet;
import java.util.Set;

public class TwoCommonArray {

    public static void main(String[] args) {
      TwoCommonArray te  = new TwoCommonArray();
      te.twocomonarray();
    }
    public void twocomonarray(){
        int[] a1 = {1,2,4,3,5,6};
        int[] a2 = {3,5,4,7,4,2};
        Set<Integer> common = new HashSet<>();
        Set<Integer> unique =new HashSet<>();
        for(int num1 : a1){
            common.add(num1);
        }
        for(int num2 :a2){
            if(common.contains(num2)){
                unique.add(num2);
            }

        }
        System.out.println(unique);
    }
}
