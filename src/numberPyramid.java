import java.util.Scanner;

public class numberPyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int mid=n/2;
        for(int i=1;i<=n;i++) {
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
