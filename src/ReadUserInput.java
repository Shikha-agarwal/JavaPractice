import java.util.Scanner;

/**
 * Created By: Shikha Agarwal
 * Project Name: Java
 * Package Name: PACKAGE_NAME
 * Date: 05-06-2021
 */
public class ReadUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your birth year:");

        boolean hasNextInt = scanner.hasNextInt();

        if(hasNextInt) {
            int myYearOfBirth = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter you name:");
            String myName = scanner.nextLine();

            int myAge = 2021 - myYearOfBirth;
            if(myAge <= 0 || myAge > 100){
                System.out.println("Invalid birth year input");
            } else {
                System.out.println("My name is " + myName + " and I am " + myAge + " years old.");
            }
        } else {
            System.out.println("Please make sure your year of birth should be in numbers.");
        }

        scanner.close();
    }
}

