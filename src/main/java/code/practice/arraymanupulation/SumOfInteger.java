package code.practice.arraymanupulation;

public class SumOfInteger {
    public static void main(String[] args) {
        String[] str = {"1","2","w","e","#","4","3"};
        int sum =0;
        for(String num : str){
            try {
                sum = sum + Integer.parseInt(num);
            }
            catch (NumberFormatException e){

            }
        }
        System.out.println(sum);
    }
}
