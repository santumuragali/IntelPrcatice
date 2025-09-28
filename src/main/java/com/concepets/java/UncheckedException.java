package com.concepets.java;

public class UncheckedException {


        public static void checkage(int age) throws CustomException {
            if(age<18){
                throw new CustomException("age is less than 18");
            }

        }

        public static void main(String[] args) throws CustomException {
            checkage(15);
        }

}
