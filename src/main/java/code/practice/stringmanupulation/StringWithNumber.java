package code.practice.stringmanupulation;

public class StringWithNumber {
    public static void main(String[] args) {
        stringWithNumber("San12tu3");
    }
    public static  void stringWithNumber(String input){
        StringBuilder digit = new StringBuilder();
        StringBuilder string = new StringBuilder();
        int sum =0;
        for(char ch : input.toCharArray()){
            if(Character.isDigit(ch)){
                digit.append(ch);
                sum =sum +(ch -'0');
            }
            else{
                string.append(ch);
            }
        }
        System.out.println(digit);
        System.out.println(sum);
    }
}
