package leapYearCalculatorChallenge;

/**
 * Created By: Shikha Agarwal
 * Project Name: Java
 * Package Name: leapYearCalculatorChallenge
 * Date: 31-05-2021
 */
public class Main {

    public static void main(String[] args) {

       boolean leapYearOrNot = LeapYear.isLeapYear(-1600);
        System.out.println(leapYearOrNot);

        leapYearOrNot = LeapYear.isLeapYear(1600);
        System.out.println(leapYearOrNot);

        leapYearOrNot = LeapYear.isLeapYear(2017);
        System.out.println(leapYearOrNot);

        leapYearOrNot = LeapYear.isLeapYear(2000);
        System.out.println(leapYearOrNot);

        leapYearOrNot = LeapYear.isLeapYear(2400);
        System.out.println(leapYearOrNot);

    }
}

