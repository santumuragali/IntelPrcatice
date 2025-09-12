package code.practice.stringmanupulation;

public class EndOfZero {
    public static void main(String[] args) {
    String str ="1209092000291";
        endOfZero(str);
    }
    public  static void endOfZero(String input){
        StringBuilder zero = new StringBuilder();
        StringBuilder digit = new StringBuilder();
        for(char ch : input.toCharArray()){
            if(ch == '0'){
                zero.append(ch);
            }
            else{
                digit.append(ch);
            }
        }
        System.out.println(digit.toString()+zero.toString());
        System.out.println(zero.append(digit));

    }
}
