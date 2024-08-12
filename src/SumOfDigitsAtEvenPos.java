public class SumOfDigitsAtEvenPos {
    public static void main(String[] args) {
        int number=1234567890;
        System.out.println(evenSum(number));
    }
    public static int evenSum(int number){
        if(number<0) return -1;
        int sum=0,i=0;
        int[] a=new int[100];
        while(number>0){
            int d=number%10;
            a[i++]=d;
            number=number/10;
        }
        for(i=0;i<a.length;i++){
            if(i%2==0) sum+=a[i];
        }
        return sum;
    }
}
