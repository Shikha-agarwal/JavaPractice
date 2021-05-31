import static java.lang.StrictMath.round;

/**
 * Created By: Shikha Agarwal
 * Project Name: Java
 * Package Name: PACKAGE_NAME
 * Date: 31-05-2021
 */
public class SpeedConverter {

    public static void main(String[] args) {

        long solvedAns = toMilesPerHour(25.42);
        System.out.println(solvedAns);
    }

    public static long toMilesPerHour(double kilometersPerHour){

        if(kilometersPerHour < 0){
            return -1;
        } else if(kilometersPerHour > 0){
            double kilometersInMiles = kilometersPerHour * 0.621;
            return round(kilometersInMiles);
        }
        return 0;
    }
}

