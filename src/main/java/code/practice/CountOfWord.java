package code.practice;

import java.util.Arrays;

public class CountOfWord {
    public static void main(String[] args) {
        String input ="java is coding  lanaguge";
        String[] val = input.split("\\s+");
        System.out.println(Arrays.toString(val));
        int count= 0;
        for(String str : val){
            count++;
        }
        System.out.println(count);
    }
}
