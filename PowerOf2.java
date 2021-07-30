package concept;
import java.util.*;

public class PowerOf2 {
	public static void main(String[] args){
		System.out.println("Enter the power of 2");
		Scanner sc= new Scanner(System.in);
		int power = 2;
		int n = sc.nextInt();
		sc.close();
		for(int i=1 ; i<=n;i++) {
			System.out.print(" 2^ "+ i + " = " +power+"; " );
			power = power*2;			
						
		}
	}
}
