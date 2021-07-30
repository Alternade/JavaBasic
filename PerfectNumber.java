package Day6;

import java.util.*;

public class PerfectNumber {
	static double perfectNum(double num) {
		double sum = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}
	public static void main(String args[]) {
		double num;
		double s;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		num = sc.nextDouble();
		s = perfectNum(num);
		sc.close();
		if (s == num)
			System.out.println(num + " is a perfect number");
		else
			System.out.println(num + " is not a perfect number");
	}
}
