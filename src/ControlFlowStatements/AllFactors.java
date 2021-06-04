package ControlFlowStatements;

/**
 * Created By: Shikha Agarwal
 * Project Name: Java
 * Package Name: ControlFlowStatements
 * Date: 04-06-2021
 */
public class AllFactors {
    public static void main(String[] args) {
        printFactors(6);
        System.out.println("-----------------------------------");
        printFactors(32);
        System.out.println("-----------------------------------");
        printFactors(10);
        System.out.println("-----------------------------------");
        printFactors(-1);
    }

    public static void printFactors(int number){
        if(number < 1){
            System.out.println("Invalid Value");
        }
        int i = 1;
        while(i <= number){
            if(number % i == 0){
                System.out.println(i);
            }
            i++;
        }
    }
}

