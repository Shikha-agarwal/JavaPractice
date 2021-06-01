/**
 * Created By: Shikha Agarwal
 * Project Name: Java
 * Package Name: PACKAGE_NAME
 * Date: 01-06-2021
 */
public class MethodOverloadingChallenge {

    public static void main(String[] args) {

        double inCentimeters = calcFeetAndInchesToCentimeters(72);
        if (inCentimeters == -1) {
            System.out.println("Invalid value");
        }
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){

        if((feet < 0) || (inches < 0) || (inches > 12)){
            return -1;
        }
        double centimeters = (feet * 12 * 2.54) + (inches * 2.54);
        System.out.println(feet + " feet and " + inches + " inches = " + centimeters + " cm");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){

        if(inches < 0){
            return -1;
        }
        double feet = inches / 12 ;
        double remaininginches = inches % 12;
        System.out.println(inches + " inches = " + feet + " feet and " + remaininginches + " inches");
        return calcFeetAndInchesToCentimeters(feet, remaininginches);
    }
}


