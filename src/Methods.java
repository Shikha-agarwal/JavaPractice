/**
 * Created By: Shikha Agarwal
 * Project Name: Java
 * Package Name: PACKAGE_NAME
 * Date: 31-05-2021
 */
public class Methods {

    public static void main(String[] args) {

        displayHighScorePosition("Shikha", 2);

        int score = calculateHighScorePosition(1500);
        System.out.println(score);

        score = calculateHighScorePosition(900);
        System.out.println(score);

        score = calculateHighScorePosition(400);
        System.out.println(score);

        score = calculateHighScorePosition(50);
        System.out.println(score);
    }

    public static void displayHighScorePosition(String playerName, int position) {

        System.out.println(playerName + " managed to get into position " + position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int playerScore) {

        if (playerScore > 1000) {
            return 1;
        } else if (playerScore > 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore > 100 && playerScore < 500) {
            return 3;
        }
        return 4;
    }
}

