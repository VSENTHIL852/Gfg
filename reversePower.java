import java.util.*;
class reversePower {
    public int reverseExponentiation(int n) {
        // code here
        int original=n;
        int rev=0;
        while(n>0){
            int digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
int result = 1;

       for (int i = 1; i <= rev; i++) {
           result = result * original;
       }

       return result;        
    }
}
public class Main{
    public static void main (String[] args) {
        int n=3;
        Solution obj= new Solution();
        System.out.println(obj.reverseExponentiation(n));
    }
}
