public class SharedDigit {
    public static void main(String[] args) {
        boolean ans = hasSharedDigit(12, 22);
        boolean ans1 = hasSharedDigit(11, 22);
        boolean ans2 = hasSharedDigit(102, 22);
        System.out.println(ans);
        System.out.println(ans1);
        System.out.println(ans2);
    }

    public static boolean hasSharedDigit(int number1, int number2) {
        if (number1 < 10 || number1 > 99 || number2 < 10 || number2 > 99) {
            return false;
        }
        int d11 = number1 / 10;
        int d12 = number1 % 10;
        int d21 = number2 / 10;
        int d22 = number2 % 10;
        return (d11 == d21 || d11 == d22 || d12 == d21 || d12 == d22);
    }
}

