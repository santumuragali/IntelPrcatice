package code.practice.stringmanupulation;

public class VowelAndConsonet {
    public static void main(String[] args) {
        vowelandCosonet("amitabachan");
    }
    public  static  void vowelandCosonet(String str){
        int vowelcount =0;
        int consonetcount =0;
        for(char ch :str.toCharArray()){
            if(ch == 'a' || ch =='e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowelcount++;
            }
            else{
                consonetcount++;
            }
        }
        System.out.println("The vowel are count  "+vowelcount);
        System.out.println("The consonent count  "+consonetcount);
    }
}
