package ControlFlowStatements;

/**
 * Created By: Shikha Agarwal
 * Project Name: Java
 * Package Name: ControlFlowStatements
 * Date: 04-06-2021
 */
public class NumbersToWords {
    public static void main(String[] args) {
        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(1));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(321));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(5200));
        System.out.println(getDigitCount(1000));

        System.out.println("------------------------------");

        System.out.println(reverse(-121));
        System.out.println(reverse(1212));
        System.out.println(reverse(1234));
        System.out.println(reverse(1000));
        System.out.println(reverse(-123));

        System.out.println("--------------------------------");

        numberToWords(123);
        System.out.println("------------------------");
        numberToWords(1010);
        System.out.println("------------------------");
        numberToWords(1000);
        System.out.println("------------------------");
        numberToWords(-12);
        System.out.println("------------------------");
    }

    public static void numberToWords(int number) {
        if(number < 0) {
            System.out.println("Invalid Value");
        }
        if(number == 0) {
            System.out.println("Zero");
        }
        int revNumber = reverse(number);
        int originalReversedNum = revNumber;
        while(revNumber != 0){
            int digit = revNumber % 10;
            switch(digit) {
                case 0 : System.out.println("Zero");break;
                case 1: System.out.println("One");break;
                case 2: System.out.println("Two");break;
                case 3: System.out.println("Three");break;
                case 4: System.out.println("Four");break;
                case 5: System.out.println("Five");break;
                case 6: System.out.println("Six");break;
                case 7: System.out.println("Seven");break;
                case 8: System.out.println("Eight");break;
                case 9: System.out.println("Nine");break;
            }
            revNumber /= 10;
        }
        if(getDigitCount(originalReversedNum) != getDigitCount(number)){
           int value = getDigitCount(number) - getDigitCount(originalReversedNum);
           for(int i = 1; i <= value ; i++){
               System.out.println("Zero");
           }
        }
    }

    public static int reverse(int number) {
        int reverseNum = 0;
        while(number != 0) {
            reverseNum *= 10;
            reverseNum += (number % 10);
            number /= 10;
        }
        return reverseNum;
    }

    public static int getDigitCount(int number) {
        if(number < 0) {
            return  -1;
        }
        if(number < 10){
            return 1;
        }
        int numOfDigits = 0;
        while(number > 0){
            number /= 10;
            numOfDigits ++;
        }
        return numOfDigits;
    }
}

