public class NumbersToWords {
    public static void main(String[] args) {
      String ans=numberToWords(1200302560);
      System.out.println(ans);
    }
    public static int getDigitCount(int n){
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        return count;
    }
    public static int reverse(int n){
        int rev=0;
        while (n>0){
            int d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        return rev;
    }
    public static String numberToWords(int num){
        int count=getDigitCount(num);
        int n=reverse(num);
        String ans="";

        while (n>0 && count-->0){
            int d=n%10;
            if(d==0)  ans += "Zero ";
            else if(d==1) ans += "One ";
            else if(d==2) ans += "Two ";
            else if(d==3) ans += "Three ";
            else if(d==4) ans += "Four ";
            else if(d==5) ans += "Five ";
            else if(d==6) ans += "Six ";
            else if(d==7) ans += "Seven ";
            else if(d==8) ans += "Eight ";
            else ans += "Nine ";

            n=n/10;

        }
        while (count-->0){
            ans+="Zero ";
        }
        return ans;
    }
}
