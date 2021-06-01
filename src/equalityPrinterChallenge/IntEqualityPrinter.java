package equalityPrinterChallenge;

/**
 * Created By: Shikha Agarwal
 * Project Name: Java
 * Package Name: equalityPrinterChallenge
 * Date: 01-06-2021
 */
public class IntEqualityPrinter {

    public static void printEqual(int number1, int number2, int number3) {

        if((number1 < 0) || (number2 < 0) || (number3 < 0)){
            System.out.println("Invalid Value");
        } else {
            if((number1 == number2) && (number2 == number3)){
                System.out.println("All numbers are equal");
            } else if((number1 != number2) && (number2 != number3)){
                System.out.println("All numbers are different");
            } else {
                System.out.println("Neither all are equal or different");
            }
        }
    }
}

