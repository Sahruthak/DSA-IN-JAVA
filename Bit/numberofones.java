package Bit;

import java.util.Scanner;

public class numberofones {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }

        System.out.println("Number of ones: " + count);
        sc.close();
    }
}
