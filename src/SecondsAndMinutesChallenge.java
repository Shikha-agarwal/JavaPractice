/**
 * Created By: Shikha Agarwal
 * Project Name: Java
 * Package Name: PACKAGE_NAME
 * Date: 01-06-2021
 */
public class SecondsAndMinutesChallenge {

    public static void main(String[] args) {

        String myResult = getgetDurationString(3600);
        System.out.println(myResult);

        myResult = getDurationString(61 , 0);
        System.out.println(myResult);
    }

    public static String getDurationString(int minutes, int seconds){

        String myValue = "";

        if((minutes < 0) || (seconds < 0) || (seconds > 59)){
            myValue =  "Invalid Value";
        } else{
            int numberOfHours = minutes / 60;
            int remainingMinutes = minutes % 60;

            if(numberOfHours < 10){
                String newNumberOfHours = "0" + numberOfHours + "h ";
                myValue = myValue + newNumberOfHours;
            } else{
                myValue = myValue + numberOfHours + "h ";
            }

            if(remainingMinutes < 10){
                String newReamainingMinutes = "0" + remainingMinutes + "m ";
                myValue = myValue + newReamainingMinutes;
            } else{
                myValue = myValue + remainingMinutes + "m ";
            }

            if(seconds < 10){
                String newSeconds = "0" + seconds + "s";
                myValue = myValue + newSeconds;
            } else{
                myValue = myValue + seconds + "s";
            }
        }
        return myValue;
    }

    public static String getgetDurationString(int seconds){

        if( seconds < 0){
            return "Invalid Value";
        }
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        System.out.println(seconds + "s = " + minutes + "m and " + remainingSeconds + "s");
        return getDurationString(minutes, remainingSeconds);
    }
}

