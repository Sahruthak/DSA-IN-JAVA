package Bit;

import java.util.*;

public class LsbAndMsb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(); // Example number
        int msb = getMSB(number);
        int lsb = getLSB(number);

        System.out.println("Number: " + number);
        System.out.println("MSB: " + msb);
        System.out.println("LSB: " + lsb);
        sc.close();
    }

    public static int getMSB(int n) {
        while (n > 1) {
            n >>= 1;
        }
        return n;
    }

    public static int getLSB(int n) {
        return n & 1;
    }
}
