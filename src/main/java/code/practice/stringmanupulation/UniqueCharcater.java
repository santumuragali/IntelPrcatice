package code.practice.stringmanupulation;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharcater {

    public static void main(String[] args) {
    duplicateRemove("ramayan ram rajaraks");
    }
    public  static  void duplicateRemove(String input){
        input = input.replace(" ","");
        Set<Character> se =new HashSet<>();
        StringBuilder res  = new StringBuilder();
        for(char ch : input.toCharArray()){
            if(se.add(ch)){
               res.append(ch);
            }
        }
        System.out.println(res);
        System.out.println(se);

    }
}
