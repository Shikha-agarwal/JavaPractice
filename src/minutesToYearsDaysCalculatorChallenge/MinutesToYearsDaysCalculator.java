package minutesToYearsDaysCalculatorChallenge;

/**
 * Created By: Shikha Agarwal
 * Project Name: Java
 * Package Name: MethodOverloadingMinutesToYearsDaysCalculatorChallenge
 * Date: 01-06-2021
 */
public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes) {
        if(minutes < 0){
            System.out.println("Invalid Value");
        }
        long numberOfYears = minutes / 525600;
        long numberOfDays = (minutes % 525600) / 1440;
        System.out.println(minutes + " min = " + numberOfYears + " y and " + numberOfDays +" d");
    }
}

