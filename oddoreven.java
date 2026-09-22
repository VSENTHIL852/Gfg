import java.util.*;
class oddoreven {
	static boolean isEven(int n) {
		if(n % 2 == 0) {
			return true;
		}
		return false;
	}

}

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		oddoreven obj = new oddoreven();
		if(obj.isEven(n)) {
			System.out.println("Even");
		}
		else {
			System.out.println("odd");
		}

	}

}
