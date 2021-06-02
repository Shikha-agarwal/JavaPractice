package ControlFlowStatements;

/**
 * Created By: Shikha Agarwal
 * Project Name: Java
 * Package Name: ControlFlowStatements
 * Date: 02-06-2021
 */
public class WhileChallengeDigitSum {
    public static void main(String[] args) {
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(9));
        System.out.println(sumDigits(-125));
        System.out.println(sumDigits(36925));
    }

    public static int sumDigits(int number) {
        int sum = 0;
        if( number >= 10){
            while(number != 0){
                sum += (number % 10);
                number /= 10;
            }
            return sum;
        }
        return -1;
    }
}


