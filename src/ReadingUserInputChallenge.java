import java.util.Scanner;

/**
 * Created By: Shikha Agarwal
 * Project Name: Java
 * Package Name: PACKAGE_NAME
 * Date: 05-06-2021
 */
public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int counter = 0;
        while(counter < 10) {
            int i = counter + 1;
            System.out.println("Enter number #" + i + ":");
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                int inputtedValue = scanner.nextInt();
                sum += inputtedValue;
                counter++;
            } else {
                System.out.println("Invalid Value");
            }
            scanner.nextLine();
        }
        System.out.println("Sum = " + sum);
        scanner.close();
    }
}


