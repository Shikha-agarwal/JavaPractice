package ControlFlowStatements;

/**
 * Created By: Shikha Agarwal
 * Project Name: Java
 * Package Name: ControlFlowStatements
 * Date: 01-06-2021
 */
public class Switch {

    public static void main(String[] args) {
        int value = 1;

//        if (value == 1){
//            System.out.println("Value was 1");
//        } else if(value == 2){
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }

        switch (value){
            case 1 :
                System.out.println("Value was 1");
                break;
            case 2 :
                System.out.println("Value was 2");
                break;
            case 3 : case 4 : case 5 :
                System.out.println("Value was a 3, or a 4 or 5");
                break;
            default:
                System.out.println("Was not 1,2,3,4 or 5");
        }

    }
}


