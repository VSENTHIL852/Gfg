import java.util.*;
class gcd {
	public static int gcd(int a, int b) {
		while(b !=0) {
			int reminder = a%b;
			a=b;
			b=reminder;

		}
		return a;

	}
}

public class Main {
	public static void main (String[] args) {
		int a=3,b=3;
		gcd obj= new gcd();
		System.out.println(obj.gcd(a,b));
	}
}
