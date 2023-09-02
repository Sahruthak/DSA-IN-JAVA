import java.util.*;

public class ToggleBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt(); // Binary: 10001
        int k = sc.nextInt();

        int mask = 1 << (k - 1);
        System.out.println(mask);

        int result = num ^ mask;

        System.out.println("Original: " + num + ", Toggled: " + result);
        sc.close();
    }
}
