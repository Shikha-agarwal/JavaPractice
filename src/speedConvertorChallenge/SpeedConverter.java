package speedConvertorChallenge;

/**
 * Created By: Shikha Agarwal
 * Project Name: Java
 * Package Name: PACKAGE_NAME
 * Date: 31-05-2021
 */
public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour){

        if(kilometersPerHour < 0){
            return -1;
        }
            return Math.round(kilometersPerHour * 0.621);
    }

    public static void printConversion(double kilometersPerHour){

        long convertedValue = toMilesPerHour(kilometersPerHour);

        if(convertedValue == -1){
            System.out.println("Invalid value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + convertedValue + " mi/h");
        }
    }
}

