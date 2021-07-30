package concept;
import java.util.*;
public class PrimeFactor {
	public static void primeFactors(int n) {
		int p = 1;
		int l = 1;
		for (int i = 2; i < n ; i++) {
			if (n%i == 0) {
				for(int j = 3; j < i ; j++) {
					if(i%j == 0) {
						break;
					}
					else {
						System.out.print(i+" ");
					}
				}
				
				l++;
				}
			p++;
		}
		if (l == 1) {
			System.out.println("Given Number is Prime");
		}
		else {
			System.out.println("The above are prime factors of "+ n);
		}
		
}

	public static void main(String[] args) {
		System.out.println("Enter a Integer");
		Scanner sc = new Scanner(System.in); 
		int n = sc.nextInt();
		sc.close();
		primeFactors(n);
	}
}
