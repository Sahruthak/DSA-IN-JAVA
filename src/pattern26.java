import java.util.Scanner;

public class pattern26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++) {
            for (int j = 0; j < 1; j++) {
                System.out.print("*");
            }
            for(int j=2;j<i;j++) {
                System.out.print(" ");
            }
            if (i != 1) {
                for (int j = 0; j < 1; j++) {
                    System.out.print("*");
                }
            }
            for(int j=1;j<=2*(n-i);j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 1; j++) {
                System.out.print("*");
            }
            for(int j=2;j<i;j++) {
                System.out.print(" ");
            }
            if (i != 1) {
                for (int j = 0; j < 1; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for(int i=n;i>0;i--){
            for (int j = 0; j < 1; j++) {
                System.out.print("*");
            }
            for(int j=2;j<i;j++) {
                System.out.print(" ");
            }
            if (i != 1) {
                for (int j = 0; j < 1; j++) {
                    System.out.print("*");
                }
            }
            for(int j=1;j<=2*(n-i);j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 1; j++) {
                System.out.print("*");
            }
            for(int j=2;j<i;j++) {
                System.out.print(" ");
            }
            if (i != 1) {
                for (int j = 0; j < 1; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
