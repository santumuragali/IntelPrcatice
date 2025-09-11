package code.practice.stringmanupulation;

import java.net.StandardSocketOptions;
import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        anagram("cat","tae");
    }
    public static void anagram(String str1,String str2){

        char ch1 [] = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        System.out.println("The given string are "+Arrays.equals(ch1,ch2));
    }
}
