package ControlFlowStatements;

/**
 * Created By: Shikha Agarwal
 * Project Name: Java
 * Package Name: ControlFlowStatements
 * Date: 02-06-2021
 */
public class ForChallengeSumOdd {

    public static void main(String[] args) {
        System.out.println(sumOdd(1,100));
        System.out.println(sumOdd(-1,100));
        System.out.println(sumOdd(100,100));
        System.out.println(sumOdd(13,13));
        System.out.println(sumOdd(100,-100));
        System.out.println(sumOdd(100,1000));
    }

    public static boolean isOdd(int number) {
        if(number < 0){
            return false;
        }
        return (number % 2 != 0);
    }

    public static int sumOdd(int start, int end) {
        if(end < start || start < 0){
            return -1;
        }
        int sum = 0;
        for(int i = start; i <= end; i ++){
            if(isOdd(i)){
                sum += i;
            }
        }
        return sum;
    }
}

