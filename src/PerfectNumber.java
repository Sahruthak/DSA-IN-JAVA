public class PerfectNumber {
    public static void main(String[] args) {
        boolean ans=perfectNumber(6);
        System.out.println(ans);
    }
    public static boolean perfectNumber(int num)
    {
        if(num<1) return false;
        int sums=0;

        for(int i=1;i<num;i++){
            if(num%i==0){
                sums+=i;
            }
        }

        if(sums==num) return true;
        else return false;
    }
}
