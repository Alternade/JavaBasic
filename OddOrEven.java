package concept;

import java.util.*;

public class OddOrEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		sc.close();
		if (n % 2 == 0)
			System.out.println(n + " is even");
		else
			System.out.println(n + " is odd");
	}

}