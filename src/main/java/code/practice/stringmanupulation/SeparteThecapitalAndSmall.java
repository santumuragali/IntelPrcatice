package code.practice.stringmanupulation;

public class SeparteThecapitalAndSmall {
    public static void main(String[] args) {
    SeparteThecapitalAndSmall se = new SeparteThecapitalAndSmall();
    se.capitalandsmall("ramRajMohanROy");
    }
    public void capitalandsmall (String input){
        StringBuilder capital = new StringBuilder();
        StringBuilder small = new StringBuilder();
        for(char ch : input.toCharArray()){
            if(ch >='a' && ch <='z'){
                small.append(ch);
            }
            else {
                capital.append(ch);
            }
        }
        System.out.println(small);
        System.out.println(capital);
    }
}
