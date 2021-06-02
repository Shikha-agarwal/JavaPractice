/**
 * Created By: Shikha Agarwal
 * Project Name: Java
 * Package Name: PACKAGE_NAME
 * Date: 02-06-2021
 */
public class ParseString {
    public static void main(String[] args) {
        String myStringValue = "2020";
        System.out.println("numberAsString = " + myStringValue);

        // converting String into int
        int number = Integer.parseInt(myStringValue);
        System.out.println("number = " + number);

        myStringValue += 1;                 // 20201
        number += 1;                        // 2020
        System.out.println("numberAsString = " + myStringValue);
        System.out.println("number = " + number);
    }
}

