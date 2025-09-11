package code.practice.stringmanupulation;

public class palindorme {
    public static void main(String[] args) {
        reverse("gadag");
    }
    public  static  void reverse(String input){
        String res = "";
        for(char ch : input.toCharArray()){
            res =ch+res;
        }
        if(input.equals(res)){
            System.out.println("The given string is palindrom "+input);
        }
        else{
            System.out.println("The given String is not palindrome "+input);
        }
    }
}
