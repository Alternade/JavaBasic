package concept;
import java.util.*;

public class Swap {
	
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 1st Integer");
		int a = sc.nextInt();
		System.out.println("Enter 2nd Integer");
		int b = sc.nextInt();
		sc.close();
		System.out.println("Before swap");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("after swap");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
	
}