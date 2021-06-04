package ControlFlowStatements;

/**
 * Created By: Shikha Agarwal
 * Project Name: Java
 * Package Name: ControlFlowStatements
 * Date: 03-06-2021
 */
public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99 ,999));
    }

    public static boolean hasSameLastDigit(int number1, int number2, int number3) {
        if((isValid(number1)) && (isValid(number2)) && (isValid(number3))) {
            return ((number1 % 10 == number2 % 10) || (number2 % 10 == number3 % 10) || (number3 % 10 == number1 % 10));
            }
        return false;
        }

    public static boolean isValid(int number){
        return ((number >= 10) && (number <= 1000));
    }
}







