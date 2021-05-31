package decimalComparatorChallenge;

/**
 * Created By: Shikha Agarwal
 * Project Name: Java
 * Package Name: decimalComparatorChallenge
 * Date: 31-05-2021
 */
public class Main {

    public static void main(String[] args) {

        boolean numbersAreEqualOrNot = DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        System.out.println(numbersAreEqualOrNot);

        numbersAreEqualOrNot = DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176);
        System.out.println(numbersAreEqualOrNot);

        numbersAreEqualOrNot = DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0);
        System.out.println(numbersAreEqualOrNot);

        numbersAreEqualOrNot = DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123);
        System.out.println(numbersAreEqualOrNot);
    }
}

