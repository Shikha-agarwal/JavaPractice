package ControlFlowStatements;

/**
 * Created By: Shikha Agarwal
 * Project Name: Java
 * Package Name: ControlFlowStatements
 * Date: 02-06-2021
 */
public class WhileChallengeFirstAndLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
    }

    public static int sumFirstAndLastDigit(int number) {
        if(number < 0){
            return -1;
        }

        int lastDigit = (number % 10);
        while(number > 9){
            number /= 10;
        }
        return (lastDigit + number);
    }
}

