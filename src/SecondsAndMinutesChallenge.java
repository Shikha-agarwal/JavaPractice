/**
 * Created By: Shikha Agarwal
 * Project Name: Java
 * Package Name: PACKAGE_NAME
 * Date: 01-06-2021
 */
public class SecondsAndMinutesChallenge {

    public static void main(String[] args) {

        System.out.println(getgetDurationString(3600));

        System.out.println(getgetDurationString(3945));

        System.out.println(getDurationString(61, 0));
    }

    public static String getDurationString(int minutes, int seconds) {

        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
           return "Invalid Value";
        }

        int numberOfHours = minutes / 60;
        int remainingMinutes = minutes % 60;

        String newNumberOfHours = numberOfHours + "h ";
        if (numberOfHours < 10) {
            newNumberOfHours = "0" + numberOfHours + "h ";
        }

        String newReamainingMinutes = remainingMinutes + "m ";
        if (remainingMinutes < 10) {
            newReamainingMinutes = "0" + remainingMinutes + "m ";
        }

        String newSeconds = seconds + "s";
        if (seconds < 10) {
            newSeconds = "0" + seconds + "s";
        }
        return newNumberOfHours + newReamainingMinutes + newSeconds;
    }

    public static String getgetDurationString(int seconds) {

        if (seconds < 0) {
            return "Invalid Value";
        }
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        System.out.println(seconds + "s = " + minutes + "m and " + remainingSeconds + "s");
        return getDurationString(minutes, remainingSeconds);
    }
}

