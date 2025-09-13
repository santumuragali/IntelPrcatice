package code.practice.arraymanupulation;

public class OddAndEvenNumber {
    public static void main(String[] args) {
        oddAndEven();

    }
    public  static void oddAndEven(){
        int[] a = {1,2,3,4,5,6};
            int odd =0;
            int oddciunt =0;
            int even =0;
            int evencount =0;
            for(int num :a){
                if(num %2 ==0){
                    even =even+num;
                    evencount++;
                }
                else{
                    odd =odd +num;
                    oddciunt++;
                    
                }
            }
            System.out.println(even);
            System.out.println(odd);

    }
}
