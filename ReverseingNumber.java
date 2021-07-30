package Day6;

import java.util.Scanner;

public class ReverseingNumber {
	static int reversDigit(int num) {
		int rev_num = 0;
		while (num > 0) {
			rev_num = rev_num * 10 + num % 10;
			num = num / 10;
		}
		return rev_num;
	}

	public static void main(String[] args) {
		System.out.println("Enter An Integer ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		System.out.println("Reverse of no. is " + reversDigit(num));
	}

}