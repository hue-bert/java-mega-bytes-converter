import java.util.Scanner;

public class MegaBytesConverter {

    /*public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter file size to convert:");
        int size = reader.nextInt();
        printMegaBytesAndKiloBytes(size);

    }*/

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid input");
        } else {
            int megabyte = (kiloBytes / 1024);
            int remainder = (kiloBytes % 1024);
            System.out.println(kiloBytes + " KB = " + megabyte + " MB and " + remainder + " KB");
        }
    }
}
