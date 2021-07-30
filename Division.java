package concept;

import java.util.*;

public class Division {
	public static void remainderAndQutient(int div, int divd) {
		System.out.println("Quotient is " + (divd / div));
		System.out.println("Remainder is  is " + (divd % div));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Divisor");
		int div = sc.nextInt();
		System.out.println("Enter Dividend");
		int divd = sc.nextInt();
		sc.close();
		remainderAndQutient(div, divd);

	}
}
