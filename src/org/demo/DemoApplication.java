package org.demo;

import java.util.Scanner;

class NonEvenNumber extends Exception {

}

public class DemoApplication {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String userLine = scanner.nextLine();
        int intVar = Integer.valueOf(userLine);
        try {
            processUserNumber(intVar);
        } catch (NonEvenNumber nonEvenNumberEx) {
            nonEvenNumberEx.printStackTrace();
            throw new RuntimeException("RuntimeException1");
        } finally {
            System.out.println("Finally block.");
            throw new RuntimeException("RuntimeException2");
        }
    }

    public static void processUserNumber(int userNumber) throws NonEvenNumber {
        if (userNumber % 2 != 0) {
            throw new NonEvenNumber();
        }
        System.out.println("Number even. All is ok");
    }

    public static void test() throws Exception {
        try{
           throw new Exception();
        }  finally {

        }
    }

}
