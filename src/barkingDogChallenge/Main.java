package barkingDogChallenge;

/**
 * Created By: Shikha Agarwal
 * Project Name: Java
 * Package Name: barkingDogChallenge
 * Date: 31-05-2021
 */
public class Main {

    public static void main(String[] args) {

        boolean value = BarkingDog.shouldWakeUp(true, 1);
        System.out.println(value);

        value = BarkingDog.shouldWakeUp(false, 2);
        System.out.println(value);

        value = BarkingDog.shouldWakeUp(true, 8);
        System.out.println(value);

        value = BarkingDog.shouldWakeUp(true, 23);
        System.out.println(value);

        value = BarkingDog.shouldWakeUp(true, -1);
        System.out.println(value);

    }
}

