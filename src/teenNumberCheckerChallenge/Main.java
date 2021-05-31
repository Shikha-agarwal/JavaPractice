package teenNumberCheckerChallenge;

/**
 * Created By: Shikha Agarwal
 * Project Name: Java
 * Package Name: teenNumberCheckerChallenge
 * Date: 31-05-2021
 */
public class Main {

    public static void main(String[] args) {

        boolean checkTeen = TeenNumberChecker.hasTeen(9, 99, 19);
        System.out.println(checkTeen);

        checkTeen = TeenNumberChecker.hasTeen(23, 15, 42);
        System.out.println(checkTeen);

        checkTeen = TeenNumberChecker.hasTeen(22, 23, 34);
        System.out.println(checkTeen);

        checkTeen = TeenNumberChecker.isTeen(9);
        System.out.println(checkTeen);

        checkTeen = TeenNumberChecker.isTeen(13);
        System.out.println(checkTeen);
    }
}

