package playingCatChallenge;

/**
 * Created By: Shikha Agarwal
 * Project Name: Java
 * Package Name: playingCatChallenge
 * Date: 01-06-2021
 */
public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature) {

        if (summer) {
           return (temperature >= 25) && (temperature <= 45);
        } else {
            return (temperature >= 25) && (temperature <= 35);
        }
    }
}

