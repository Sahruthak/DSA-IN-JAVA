package Bit;

import java.util.Scanner;

public class evenodd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        long ans = n & 1;

        if (ans == 0) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }
        sc.close();
    }
}
