package ControlFlowStatements;

/**
 * Created By: Shikha Agarwal
 * Project Name: Java
 * Package Name: ControlFlowStatements
 * Date: 01-06-2021
 */
public class SwitchChallengeDayOfTheWeek {

    public static void main(String[] args) {
        printDayOfTheWeek(0);
        printDayOfTheWeek(2);
        printDayOfTheWeek(5);
        printDayOfTheWeek(9);
    }

    public static void printDayOfTheWeek(int day) {

        switch (day) {
            case 0 :
                System.out.println("Sunday");
                break;
            case 1 :
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}

