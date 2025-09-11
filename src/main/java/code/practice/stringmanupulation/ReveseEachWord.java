package code.practice.stringmanupulation;

public class ReveseEachWord {

    public static void main(String[] args) {
        ReveseEachWord re = new ReveseEachWord();
        re.reverseEachWord("Java is programing lanaguges");
    }
    public  void reverseEachWord(String input){
        String[] str = input.split(" ");
        StringBuilder res = new StringBuilder();
//        StringBuilder val = new StringBuilder();
        for(String out : str){
            String rev = "";
//            val.delete(0,val.length());
            for(char ch : out.toCharArray()){
               rev = ch + rev;
//               val.insert(0,ch);
            }
//            System.out.println(val);
            res.append(rev).append(" ");
        }
        System.out.println(res);
    }
}
