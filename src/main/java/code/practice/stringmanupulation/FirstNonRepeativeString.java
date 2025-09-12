package code.practice.stringmanupulation;

import java.util.HashSet;
import java.util.Set;

public class FirstNonRepeativeString {
    public static void main(String[] args) {
        firstNonRepeative("abcdefabcd");
    }
    public static void firstNonRepeative(String input){
        Set<Character> se = new HashSet<>();
        int right =0;int left =0;
        int startindex =0,maxlenghth =0;


            while (right<input.length()){
                char ch = input.charAt(right);
                if(se.contains(ch)){
                    se.remove(input.charAt(left));
                    left++;
                }
                se.add(ch);
                if(right-left +1>maxlenghth){
                    maxlenghth =right-left+1;
                    startindex = left;
                }
                right++;
            }

        System.out.println(input.substring(startindex,startindex+maxlenghth));


    }
}
