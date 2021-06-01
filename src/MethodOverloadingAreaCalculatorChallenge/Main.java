package MethodOverloadingAreaCalculatorChallenge;

/**
 * Created By: Shikha Agarwal
 * Project Name: Java
 * Package Name: MethodOverloadingAreaCalculatorChallenge
 * Date: 01-06-2021
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("Area of circle =" + AreaCalculator.area(5.0));

        System.out.println("Area of circle =" + AreaCalculator.area(-1));

        System.out.println("Area of recatngle =" + AreaCalculator.area(5.0, 4.0));

        System.out.println("Area of recatngle =" + AreaCalculator.area(-1.0 , 4.0));
    }
}

