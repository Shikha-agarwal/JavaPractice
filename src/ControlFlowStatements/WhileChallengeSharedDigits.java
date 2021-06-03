package ControlFlowStatements;

/**
 * Created By: Shikha Agarwal
 * Project Name: Java
 * Package Name: ControlFlowStatements
 * Date: 03-06-2021
 */
public class WhileChallengeSharedDigits {
    public static void main(String[] args) {
        System.out.println(hasSharedDigits(12,23));
        System.out.println(hasSharedDigits(9,99));
        System.out.println(hasSharedDigits(15,55));
        System.out.println(hasSharedDigits(12,67));
        System.out.println(hasSharedDigits(8,88));
        System.out.println(hasSharedDigits(12,13));
    }
    public static boolean hasSharedDigits(int number1, int number2) {
        if((number1 < 10) || (number1 > 99) || (number2 < 10) || (number2 > 99)){
            return false;
        }

        int originalNumber2 = number2;
        while(number1 != 0){
            int digit = number1 % 10;
            while(number2 != 0){
                if(digit == (number2 % 10)){
                    return true;
                }
                number2 /= 10;
            }
            number1 /= 10;
            number2 = originalNumber2;
        }
        return false;
    }
}

