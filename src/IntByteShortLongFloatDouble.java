/**
 * Created By: Shikha Agarwal
 * Project Name: Java
 * Package Name: PACKAGE_NAME
 * Date: 23-05-2021
 */
public class IntByteShortLongFloatDouble {

    public static void main(StringType[] args) {

        // int
        int a = 20;
        int myIntMinValue = Integer.MIN_VALUE;
        int myIntMaxValue = Integer.MAX_VALUE;
        System.out.println("Integer Min Value : " + myIntMinValue);
        System.out.println("Integer Max Value : " + myIntMaxValue);
        int myMaxIntTest  = 2_147_483_647;               // or int myMaxTest = 2147483647; these both are same.
        int circularTest  = myIntMaxValue + 1;
        System.out.println(circularTest);
        int circularTest1  = myIntMinValue - 1;
        System.out.println(circularTest1);

        // byte
        byte mybyteMinValue = Byte.MIN_VALUE;
        byte mybyteMaxValue = Byte.MAX_VALUE;
        System.out.println("Byte Min Value : " + mybyteMinValue);
        System.out.println("Byte Max Value : " + mybyteMaxValue);

        // short
        short myshortMinValue = Short.MIN_VALUE;
        short myshortMaxValue = Short.MAX_VALUE;
        System.out.println("Short Min Value : " + myshortMinValue);
        System.out.println("Short Max Value : " + myshortMaxValue);

        // long
        long myLongValue = 100L;
        long myLongMinValue = Long.MIN_VALUE;
        long myLongMaxValue = Long.MAX_VALUE;
        System.out.println("Long Min Value : " + myLongMinValue);
        System.out.println("Long Max Value : " + myLongMaxValue);



        byte myByteValue =  100;
        short myShortValue = 40;
        int myIntValue = 30;
        long myLongTotal = 50000L + ( 10 * ( myByteValue + myShortValue +myIntValue));
        System.out.println(myLongTotal);


        //float
        float myFloatMinValue = Float.MIN_VALUE;
        float myFloatMaxValue = Float.MAX_VALUE;
        System.out.println("Float Min Value : " + myFloatMinValue);
        System.out.println("Float Max Value : " + myFloatMaxValue);

        // double
        double myDoubleMinValue = Double.MIN_VALUE;
        double myDoubleMaxValue = Double.MAX_VALUE;
        System.out.println("Double Min Value : " + myDoubleMinValue);
        System.out.println("Double Max Value : " + myDoubleMaxValue);

        int myIntValue1 = 5;                         // output: 5
        float myFloatValue = 5f;                     //         5.0
        double myDoubleValue = 5d;                   //         5.0

        int myIntValue2 = 5;
        float myFloatValue1 = 5.25f;      //by default java treates every decimal number as a double so if we will remove f from it it
                     //OR                        //then it will be treated as double and hence we will get an error. Example: float myNumber = 5.25;
        float myFloatValue2 = (float)5.25;                 // it is correct but not used bcz it looks too complex.
        double myDoubleValue1 = 5.25d;


        


                              // CASTING
        // -------------------------------------------------------------------------------

        int myTotal = (myIntMinValue / 2);

        //byte myNewyteValue = (mybyteMinValue / 2);    // This line will give an error because java treats everything in as integer
                                                           // but the required format is byte therefore we will do casting here.
        byte myNewByteValue = (byte) (mybyteMinValue / 2);

        short myNewShortValue = (short) (myshortMinValue / 2);




    }
}

