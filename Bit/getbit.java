package Bit;

import java.util.Scanner;

public class getbit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pos = sc.nextInt();
        int ans = 1 << pos;
        if ((ans & n) == 0) {
            System.out.println("zero");
        } else {
            System.out.println("one");
        }
        sc.close();
    }
}
