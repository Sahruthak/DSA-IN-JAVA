package Bit;

import java.util.Scanner;

public class powerof2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans = n & (n - 1);

        if (ans == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}
