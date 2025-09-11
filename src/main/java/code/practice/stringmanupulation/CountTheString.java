package code.practice.stringmanupulation;

public class CountTheString {
    public static void main(String[] args) {
        countString("aabbccc");
    }
    public static  void countString(String inp){
        StringBuilder res = new StringBuilder();
        int count =1;
        for(int i =0;i<inp.length();i++){

            if(i+1<inp.length() && inp.charAt(i) == inp.charAt(i+1)){
                count++;
            }
            else{
                res.append(inp.charAt(i)).append(count);
                count =1;
            }
        }
        System.out.println(res);
    }

}
