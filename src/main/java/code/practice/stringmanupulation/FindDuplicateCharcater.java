package code.practice.stringmanupulation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicateCharcater {
    public static void main(String[] args) {
        duplicate("java is program");
    }
    public  static  void duplicate(String str){
        Map<Character,Integer> lis = new HashMap<>();
        str =str.replace(" ","");
        System.out.println(str);
        for(char ch : str.toCharArray()){
            lis.put(ch, lis.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> entry : lis.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey() + " "+entry.getValue());
            }
        }
        System.out.println(lis);

    }
}
