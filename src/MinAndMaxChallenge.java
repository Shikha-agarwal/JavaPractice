import java.util.Scanner;

/**
 * Created By: Shikha Agarwal
 * Project Name: Java
 * Package Name: PACKAGE_NAME
 * Date: 06-06-2021
 */
public class MinAndMaxChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;
        boolean first = true;

        while(true) {
            System.out.println("Enter number");
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt) {
                int number = scanner.nextInt();
                if(first) {
                    min = number;
                    max = number;
                    first = false;
                }
                if(number < min) {
                    min = number;
                } else if(number > max) {
                    max = number;
                }
            } else {
                break;
            }
        }
        System.out.println("Min: " + min + "     Max: " + max);
        scanner.close();
    }
}

