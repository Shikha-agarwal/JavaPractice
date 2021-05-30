/**
 * Created By: Shikha Agarwal
 * Project Name: Java
 * Package Name: PACKAGE_NAME
 * Date: 22-05-2021
 */
public class HelloWorldFirstProg {

    public static void main(StringType[] args){

        System.out.println("Hello Shikha");    // "Hello Shikha" is a string literal in java. Its value cannot be changed,unlike a variable

        int myFirstNumber = 5;                 // This is a declaration statement: used to define variable by indicating the data type,name and optionally setting the variable to certain value
        System.out.println(myFirstNumber);

        int myFirstNumber1 = 5 + 10;
        System.out.println(myFirstNumber1);

        int myFirstNumber2 = (5 + 10) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber2 * 2;
        int  myTotal = myFirstNumber2 + mySecondNumber + myThirdNumber;
        System.out.println(myTotal);
        int mylastOne = 1000 - myTotal;
        System.out.println(mylastOne);

    }
}

