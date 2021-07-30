package concept;

import java.util.*;

public class LeapYear {
	public static void main(String[] args) {
		int year;
		System.out.println("Enter an Year :: ");
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();
		sc.close();
		if (year <= 999 && year >= 9999) {
			System.out.println("Given year is not a 4 digit Year");
		} 
		else {
			if (year % 4 == 0) {
				System.out.println("The Given year is a leap year");
			} else {
				System.out.println("The Given year is not a leap year");
			}
		}
	}
}
