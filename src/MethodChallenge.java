/**
 * Created By: Shikha Agarwal
 * Project Name: Java
 * Package Name: PACKAGE_NAME
 * Date: 01-06-2021
 */
public class MethodChallenge {

    public static void main(String[] args) {

        double inCentimeters = calcFeetAndInchesToCentimeters(72);
        if (inCentimeters == -1) {
            System.out.println("Invalid value");
        } else {
            System.out.println(inCentimeters + " cm");
        }
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){

        if((feet < 0) || (inches < 0) || (inches > 12)){
            return -1;
        }
        return (feet * 12 * 2.54) + (inches * 2.54);
    }

    public static double calcFeetAndInchesToCentimeters(double inches){

        if(inches < 0){
            return -1;
        }
        double feet = inches / 12 ;
        double remaininginches = inches % 12;
        return calcFeetAndInchesToCentimeters(feet ,remaininginches);
    }
}


