import java.util.Scanner;

public class pattern24 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for (int j=0;j<n-1-i;j++){
                System.out.print(" ");
            }
            for (int j=i+1;j>=1;j--){
                System.out.print(j);
            }
            for (int j=2;j<=i+1;j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}
