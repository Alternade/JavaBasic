package concept;

import java.util.*;

public class EvenAndOdd {

	public static int isEven(int num) {
		if(num%2==0) {
			return 0;
		}
		else {
		return num=1;
		}
	}	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Integer");
		int num = sc.nextInt();
		int res = isEven(num);
		sc.close();
		if(res==0) {
			System.out.println("Number is Even");
		}
		else {
			System.out.println("Number is odd");
		}
	}

}
