package Bit;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0, i = 0, d;
        while (n != 0) {
            d = n & 1;
            if (d == 1)
                ans = (int) Math.pow(2, i) + ans;
            n = n / 10;
            i++;
        }
        System.out.print(ans);
        sc.close();
    }
}
