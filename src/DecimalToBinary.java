import java.util.Scanner;

public class DecimalToBinary {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            for(int i=1;i<=n;i++){
                int temp=i;
                StringBuilder binary = new StringBuilder();
                while(temp>0){
                    int d=temp%2;
                    binary.append(d);
                    temp=temp/2;
                }
                System.out.println(binary.reverse().toString());
            }
        }
}

