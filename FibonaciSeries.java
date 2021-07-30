package Day6;
import java.util.*;

public class FibonaciSeries {
	static void fib(int n) {
		int n1=0;
		int n2=1;
		for (int i = 1; i <= n; ++i) {
			System.out.print(n1 + ", ");
		    int n3 = n1 + n2;
		    n1 = n2;
		    n2 = n3;
		}
	}
	public static void main(String[] args){
		System.out.println("Enter The nth Term for The fibonaci Series");
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		sc.close();
		fib(n);
	}
}	