package equalSumChecker;

/**
 * Created By: Shikha Agarwal
 * Project Name: Java
 * Package Name: equalSumChecker
 * Date: 31-05-2021
 */
public class Main {

    public static void main(String[] args) {

        boolean result = EqualSumChecker.hasEqualSum(1, 1, 1);
        System.out.println(result);

        result = EqualSumChecker.hasEqualSum(1, 1, 2);
        System.out.println(result);

        result = EqualSumChecker.hasEqualSum(1, -1, 0);
        System.out.println(result);

    }
}

