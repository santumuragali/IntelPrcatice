package code.practice.stringmanupulation;
import  java.util.*;
public class OccurenceString {
    public static void main(String[] args) {
        String input = "java is java program lanaguge is good";
        String[] str = input.split(" ");
        Map<String,Integer> map =new HashMap<>();

        for(String res :str){
            map.put(res ,map.getOrDefault(res,0)+1);
        }
        System.out.println(map);
    }
}
