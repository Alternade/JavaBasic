package Day6;

import java.util.*;

public class HarmonicNumber {
	static double nthHarmonic(int n) {

		float harmonic = 1;

		for (int i = 2; i <= n; i++) {
			harmonic = harmonic + 1 / i;
		}

		return harmonic;
	}

	public static void main(String[] args) {
		System.out.println("Enter tne nth number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		System.out.print(nthHarmonic(n));

	}
}
