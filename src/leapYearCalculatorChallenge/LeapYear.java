package leapYearCalculatorChallenge;

/**
 * Created By: Shikha Agarwal
 * Project Name: Java
 * Package Name: leapYearCalculatorChallenge
 * Date: 31-05-2021
 */
public class LeapYear {

    public static boolean isLeapYear(int year){

        boolean isLeapYear = false;

        if((year >= 1) && (year <= 9999)){

            if(year % 4 == 0 && year % 100 != 0){
                isLeapYear = true;
            } else if(year % 100 == 0 && year % 400 == 0){
               isLeapYear = true;
            }
        }
        return isLeapYear;
    }
}

