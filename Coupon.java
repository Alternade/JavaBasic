package Day6;


import java.util.*;

public class Coupon {

	public static void main(String[] args) {
		int[] c = new int[10];
		int max = 999999999;
		Random random1 = new Random();
		for (int i = 0; i < c.length; i++) {
			c[i] = random1.nextInt();

		}
		int random = (int) (Math.random() * max);
		while (random > 0) {
			for (int i = 0; i < c.length; i++) {
				c[i] = random % c[i];
				random = random / c.length;
			}

		}
		System.out.println("Coupon Code: ");
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] );
		}

	}
}
