package practice;

/**
 * Created By: Shikha Agarwal
 * Project Name: Java
 * Package Name: PACKAGE_NAME
 * Date: 17-03-2021
 */
public class Student {
    private int rollNumber;
    private String name;
    private char section;
    boolean isCoronaPositive;

    public Student(int rollNumber, String name, char section) {       // alt+insert      ctrl+A
        this(rollNumber, name); // Used in case of constructor overloading. Used when we want to call another constructor.
        this.section = section;
    }

    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSection() {
        return section;
    }

    public void setSection(char section) {
        this.section = section;
    }

    public boolean evaluate(){
        return false;
    }

    public boolean getResult(){
        boolean result = evaluate();
        if(result){
            isCoronaPositive = true;
        }
            isCoronaPositive = false;
        return isCoronaPositive;
    }
}

/**
 * class is a basic template that defines the basic structure of an object. It defines the characteristics of the real world entity.
 * In technical terms a class contains variables which are characteristics of a class and the methods which defines the functioning of object.
 * Final class has two characteristics:  1) It can't be changed.
 *                                       2) it cannot be inherited
 */

