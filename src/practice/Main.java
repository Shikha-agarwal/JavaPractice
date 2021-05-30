package practice;

/**
 * Created By: Shikha Agarwal
 * Project Name: Java
 * Package Name: PACKAGE_NAME
 * Date: 17-03-2021
 */
public class Main {
    public static void  main(String[] args) {
        Student student = new Student(5, "Shikha",'C');    //student is an instance variable
        // #CBFD4562 : It is the address of object where all data is stored.
        Student student1 = new Student(6,"Naman", 'D');
        // #CDSA457
        student.getName();
    }
}

