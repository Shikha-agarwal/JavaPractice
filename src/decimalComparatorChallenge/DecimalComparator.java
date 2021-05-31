package decimalComparatorChallenge;

/**
 * Created By: Shikha Agarwal
 * Project Name: Java
 * Package Name: decimalComparatorChallenge
 * Date: 31-05-2021
 */
public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2){

        return (int) (number1 * 1000) == (int) (number2 * 1000);
    }
}

