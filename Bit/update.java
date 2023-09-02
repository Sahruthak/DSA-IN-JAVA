package Bit;

import java.util.Scanner;

public class update {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pos = sc.nextInt();
        int opt = sc.nextInt();
        int ans = 1 << pos;

        if (opt == 0) {
            System.out.println((~ans & n));
        }
        if (opt == 1) {
            System.out.println((ans | n));
        }
        sc.close();
    }
}
