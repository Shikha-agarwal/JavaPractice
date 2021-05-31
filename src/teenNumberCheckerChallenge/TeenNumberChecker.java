package teenNumberCheckerChallenge;

/**
 * Created By: Shikha Agarwal
 * Project Name: Java
 * Package Name: teenNumberCheckerChallenge
 * Date: 31-05-2021
 */
public class TeenNumberChecker {

    public static boolean hasTeen(int number1, int number2, int number3){
        return (isTeen(number1) || isTeen(number2) || isTeen(number3));
    }

    public static boolean isTeen(int number4){
        return ((number4 >= 13) && (number4 <= 19));
    }

}

