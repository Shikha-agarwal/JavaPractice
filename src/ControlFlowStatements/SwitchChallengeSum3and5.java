package ControlFlowStatements;
/**
 * Created By: Shikha Agarwal
 * Project Name: Java
 * Package Name: ControlFlowStatements
 * Date: 02-06-2021
 */
public class SwitchChallengeSum3and5 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for(int i = 1; i <= 1000; i++){
            if((i % 3 == 0) && (i % 5 == 0)){
                System.out.println(i);
                sum = sum + i;
                count = count + 1;
                }
            if(count == 5){
                break;
            }
        }
        System.out.println("The sum is: " + sum);
    }
}

