import org.w3c.dom.ls.LSOutput;

/**
 * Created By: Shikha Agarwal
 * Project Name: Java
 * Package Name: PACKAGE_NAME
 * Date: 30-05-2021
 */
public class Operator {
    public static void main(String[] args) {
        double firtValue = 20.00d;
        double secondValue = 80.00d;
        double newNum = (firtValue + secondValue) * 100;
        double remainder = newNum % 40.00d;
        boolean myBoolValue = (remainder == 0) ? true : false;
        System.out.println(myBoolValue);
        if(!myBoolValue){
            System.out.println("Got some remainder");
        }
    }
}

