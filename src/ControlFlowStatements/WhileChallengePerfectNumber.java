package ControlFlowStatements;

/**
 * Created By: Shikha Agarwal
 * Project Name: Java
 * Package Name: PACKAGE_NAME
 * Date: 04-06-2021
 */
public class WhileChallengePerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }

    public static boolean isPerfectNumber(int number) {
        if(number < 1){
            return false;
        }
        int sum = 0;
        int i = 1;
        while(i < number) {
            if(number % i == 0){
                sum += i;
            }
            i++;
        }
        return (sum == number);
    }
}

