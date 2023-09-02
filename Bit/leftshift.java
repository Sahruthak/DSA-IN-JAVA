package Bit;

import java.util.*;

class leftshift {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int ans = n << m;
        System.out.print(ans);
        sc.close();
    }
}