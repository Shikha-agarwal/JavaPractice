/**
 * Created By: Shikha Agarwal
 * Project Name: Java
 * Package Name: PACKAGE_NAME
 * Date: 30-05-2021
 */
public class if_then {
    public static void main(String[] args) {
        boolean isAlien = false;
        if(isAlien == false) {
            System.out.println("It is not an Alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 100;
        if(topScore != 100){
            System.out.println("You got High score!");
        }

        int secondTopScore = 60;
        if((topScore > secondTopScore) && (topScore < 120)){
            System.out.println("Greater than second top score and less than 120 ");
        }

        if((topScore >120) || (secondTopScore <= 90)){
            System.out.println("Either or both of the conditions are true");
        }

        boolean isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar){
            System.out.println("wasCar is true");
        }
    }
}

