package code.practice.arraymanupulation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NonRepeative {
    public static void main(String[] args) {
        nonRepeative();
    }
    public static void nonRepeative(){
        int [] a = {1,2,3,2,1,4,3,5,3,2,6};
        Map<Integer,Integer> map = new HashMap<>();

        for(int num : a){
            map.put(num,map.getOrDefault(num ,0)+1);
        }
        System.out.println(map);
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue() == 1){
                System.out.print(entry.getKey()+" ");
            }
        }

    }
}
