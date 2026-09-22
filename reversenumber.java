import java.util.*;
class reversenumber{
   int reverseDigits(int n) {
     int rev=0;
     while(n>0){
       int digit=n%10;
       rev=rev*10+digit;
       n=n/10;
     }

     return rev;
   
   }
}

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    reversenumber obj=new reversenumber();
    System.out.println(obj.reverseDigits(n));
  }
}
