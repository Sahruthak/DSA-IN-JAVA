import java.util.Scanner;

public class pattern27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 1; j++) {
                if(i==1) System.out.print("*");
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
