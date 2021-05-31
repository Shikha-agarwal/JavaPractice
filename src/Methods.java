/**
 * Created By: Shikha Agarwal
 * Project Name: Java
 * Package Name: PACKAGE_NAME
 * Date: 31-05-2021
 */
public class Methods {

    public static void main(String[] args) {

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Shikha", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Yash", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Shina", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Ravi", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Harsh", highScorePosition);
    }

    public static void displayHighScorePosition(String playerName, int position) {

        System.out.println(playerName + " managed to get into position " + position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int playerScore) {

//        if (playerScore >= 1000) {
//            return 1;
//        } else if (playerScore >= 500) {
//            return 2;
//        } else if (playerScore >= 100) {
//            return 3;
//        }
//        return 4;

                    // OR

        int position = 4;

        if(playerScore >= 1000){
            position = 1;
        } else if(playerScore >= 500){
            position = 2;
        } else if(playerScore >= 100){
            position = 3;
        }
        return position;
    }
}

