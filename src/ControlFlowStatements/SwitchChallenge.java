package ControlFlowStatements;

/**
 * Created By: Shikha Agarwal
 * Project Name: Java
 * Package Name: ControlFlowStatements
 * Date: 01-06-2021
 */
public class SwitchChallenge {

    public static void main(String[] args) {
        char myChar = 'D';

        switch (myChar) {
            case 'A' : case 'B' : case 'C' : case 'D' : case 'E' :
                System.out.println(myChar + " is found");
                break;
            default :
                System.out.println("A,B,C,D or E is not foud");
        }

        String month = "January";

        switch (month.toLowerCase()) {
            case "january" : case "june" :
                System.out.println(month);
                break;
            default:
                System.out.println("Not sure");
        }
    }
}

