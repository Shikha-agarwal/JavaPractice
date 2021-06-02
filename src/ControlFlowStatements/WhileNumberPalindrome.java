package ControlFlowStatements;

/**
 * Created By: Shikha Agarwal
 * Project Name: Java
 * Package Name: ControlFlowStatements
 * Date: 02-06-2021
 */
public class WhileNumberPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }

    public static boolean isPalindrome(int number) {
        int oldNumber = number;
        int reverse = 0;
        while(number != 0){
            reverse *= 10;
            reverse += (number % 10);
            number /= 10;
        }
        return (oldNumber == reverse);
    }
}

