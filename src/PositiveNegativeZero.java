/**
 * Created By: Shikha Agarwal
 * Project Name: Java
 * Package Name: PACKAGE_NAME
 * Date: 31-05-2021
 */
public class PositiveNegativeZero {

    public static void main(String[] args) {
        checkNumber(25);
        checkNumber(-12);
    }

    public static void checkNumber(int number){

        if(number > 0){
            System.out.println(number + " is positive number");
        } else if(number < 0){
            System.out.println(number + " is negative number");
        }else{
            System.out.println("zero");
        }
    }
}

