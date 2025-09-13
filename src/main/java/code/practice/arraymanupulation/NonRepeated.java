package code.practice.arraymanupulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class NonRepeated {
    public static void main(String[] args) {
        nonrepeative();
    }
    public static void nonrepeative(){
        Integer[] a = {1,2,2,4,3,5,4,6};
        List li =Arrays.asList(a);
        HashSet<Integer> hs = new HashSet<>(li);
        System.out.println(hs);
    }
}
