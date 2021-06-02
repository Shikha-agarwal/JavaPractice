package ControlFlowStatements;

/**
 * Created By: Shikha Agarwal
 * Project Name: Java
 * Package Name: ControlFlowStatements
 * Date: 01-06-2021
 */
public class SwitchChallengeNumberOfDaysInMonth {

    public static void main(String[] args) {
        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));
    }

    public static boolean isLeapYear(int year) {
        boolean myBoolValue = false;
        if((year >= 1) && (year <= 9999)) {
            if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
                myBoolValue = true;
            }
        }
        return myBoolValue;
    }

    public static int getDaysInMonth(int month, int year) {
        if((month < 1 || month > 12) || (year < 1 || year > 9999)){
            return -1;
        }
        int numberOfDays = 31;
            switch(month) {
                case 4: case 6 :case 9: case 11:
                    numberOfDays = 30;
                    break;
                case 2: if(isLeapYear(year)){
                    numberOfDays = 29;
                } else {
                    numberOfDays = 28;
                }
                    break;
            }
            return numberOfDays;
    }
}


