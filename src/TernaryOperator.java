/**
 * Created By: Shikha Agarwal
 * Project Name: Java
 * Package Name: PACKAGE_NAME
 * Date: 30-05-2021
 */
public class TernaryOperator {
    public static void main(String[] args) {
        int ageOfClient = 20;
        boolean isEighteenOrOver = (ageOfClient == 20) ? true : false;
        if (isEighteenOrOver) {
            System.out.println("Age of client is greater than 20");
        }


        boolean isCar = false;
        boolean wasCar = (isCar) ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }
    }
}

