package ControlFlowStatements;

/**
 * Created By: Shikha Agarwal
 * Project Name: Java
 * Package Name: ControlFlowStatements
 * Date: 04-06-2021
 */
public class ForChallengeGreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25 ,15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if((first < 10) || (second < 10)){
            return -1;
        }
        int value;
        int greatest = 1;
        value = Math.max(first, second);
        for(int i = 2; i <= value; i++){
            if((first % i == 0) && (second % i == 0)){
               greatest = i;
            }
        }
        return  greatest;
    }
}

