package Bit;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0, ans = 0, i = 0;
        while (n != 0) {
            count = n & 1;
            ans = (int) (Math.pow(10, i) * count + ans);
            n = n >> 1;
            i++;
        }
        System.out.print(ans);
        sc.close();
    }
}
