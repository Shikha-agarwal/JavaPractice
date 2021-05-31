package megaByteConverterChallenge;

/**
 * Created By: Shikha Agarwal
 * Project Name: Java
 * Package Name: megaByteConverterChallenge
 * Date: 31-05-2021
 */
public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        } else {
            int megaBytes = kiloBytes / 1024;
            int remainingKiloBytes = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB");
        }
    }
}

