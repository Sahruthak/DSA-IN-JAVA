package Bit;

import java.util.Scanner;

public class setbit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pos = sc.nextInt();
        int ans = 1 << pos;

        System.out.println((ans | n));
        sc.close();
    }
}
