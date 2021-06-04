package ControlFlowStatements;

/**
 * Created By: Shikha Agarwal
 * Project Name: Java
 * Package Name: ControlFlowStatements
 * Date: 04-06-2021
 */
public class ForChallengeLargestPrimeFactor {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
    }

    public static int getLargestPrime(int number) {
        if(number <= 0){
            return -1;
        }
        int largestPrime = 0;
        int j;
        for(int i = 2; i <= number; i++) {
            if(number % i == 0){
                for( j = 2; j < i; j++){
                    if(i % j == 0){
                        break;
                    }
                }
                if( j == i){
                    largestPrime = i;
                }
            }
        }
        if(largestPrime == 0){
            return -1;
        }
        return largestPrime;
    }
}


