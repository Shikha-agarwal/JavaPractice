package barkingDogChallenge;

/**
 * Created By: Shikha Agarwal
 * Project Name: Java
 * Package Name: barkingDogChallenge
 * Date: 31-05-2021
 */
public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        if (hourOfDay >= 0 && hourOfDay <= 23) {
            if (barking) {
                return (hourOfDay < 8) || (hourOfDay > 22);
            }
        }
        return false;
    }
}
